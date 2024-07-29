package DSA.Stack;
import java.util.Stack;
import java.util.Scanner;

class infixTOprefix {
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static boolean check(char op1, char op2) {
        return precedence(op1) > precedence(op2) || (precedence(op1) == precedence(op2) && op1 != '^');
    }

    public static String infixToPrefix(String infix) {
        // Reverse the infix expression
        String reversedInfix = new StringBuilder(infix).reverse().toString();
        
        // Swap the parentheses
        reversedInfix = reversedInfix.replace('(', 'T');
        reversedInfix = reversedInfix.replace(')', '(');
        reversedInfix = reversedInfix.replace('T', ')');

        // Convert to postfix
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char a = reversedInfix.charAt(i);

            if (Character.isLetterOrDigit(a)) {
                postfix.append(a);
            } else if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else { // an operator is encountered
                while (!stack.isEmpty() && check(stack.peek(), a)) {
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        // Reverse the postfix expression to get the prefix expression
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression:");
        String infix = sc.nextLine();

        String result = infixToPrefix(infix);
        System.out.println("The prefix expression is:");
        System.out.println(result);
    }
}