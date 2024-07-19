
//Check whether given number is Proth number. If a number can be expressed in the form of kX2^n + 1, it's called a proth number, where k and n are positive integers and 2^n > k. Proth number series goes like this: 3, 5, 9, 13, 17, 25, 33, 41, 49, 57, 65, ..
import java.util.Scanner;

class prothnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int power = 1;
        num = num - 1; 

        while (num % 2 == 0) {
            num = num / 2;
            power = power * 2;
        }

        if (num < power) {
            System.out.println("Proth Number");
        } else {
            System.out.println("Not a Proth Number");
        }
    }
}
