package DSA.Stack;
import java.util.Stack;
import java.util.Scanner;
class stack_infix_to_postfix{
    public static int precedence(char operator){
        switch(operator){
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
    
    public static boolean check(char op1, char op2){
        return precedence(op1) >= precedence(op2);
    }
    
    public static String infixtopost(String n){   //3....obtaining arguments as a string n
        
        StringBuilder postfix = new StringBuilder(); //4...creating new string postfix
       // String postfix="";
        Stack <Character> stack = new Stack<>();// 5.....creating empty Stack
        for(int i =0;i<n.length();i++){ /// 6.... converting string into character
            char a = n.charAt(i);         // here i='('
            
            if (Character.isLetterOrDigit(a)){ // it is not letter or digit ,so condition false
                postfix.append(a);
            }
            else if(a == '('){ //// condition true
                stack.push(a);  // push the charactr '(' in the stack
            }
            else if(a==')'){   //if ')' come here 
                while(!stack.isEmpty() && stack.peek() != '('){ //it pop all operator until it become '('
                    postfix.append(stack.pop());
                }
                stack.pop(); // if else loop finshed after that
            }else{
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),a)){
                    postfix.append(stack.pop());
                }
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
            
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();  // 1....input n=(a*b)-d+p
        
        String result = infixtopost(n); // 2.....passing parameter
        System.out.println(result);
    }
}