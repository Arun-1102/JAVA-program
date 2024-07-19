//Find all the prime factors of the given number
import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long divisor = 2;
        long count = 0;
        while (num != 1) {
            if (num % divisor == 0) {
                count++;
                num = num / divisor;
            } else {
                if (count > 0)
                    System.out.printf("%d -> %d\n", divisor, count);
                divisor++;
                count = 0;
            }
        }
        System.out.printf("%d -> %d", divisor, count);
    }
}