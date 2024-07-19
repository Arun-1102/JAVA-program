//For the given N , generate a N values of a series where the odd terms are multiples of 2 and even terms are obtained by dividing previous term by 2.
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        for (long number = 1; number <= N; number++) {
            if (number % 2 == 0) {
                System.out.print((number / 2) - 1 + " ");
            } else {
                System.out.print(number - 1 + " ");
            }
        }
    }
}
