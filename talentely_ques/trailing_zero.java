//Given an input value, count the number of trailing zeros in the factorial of the given number.
import java.util.Scanner;

class trailing_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long zero = 0;

        while (num > 0) {
            zero += num / 5;
            num /= 5;
        }

        System.out.println(zero);
    }
}
