//Given a N, Write a program to generate a series of N values that has 2 and 3 powers alternatively
import java.util.Scanner;

class seriesof_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long two = 1;
        long three = 1;

        for (long num = 1; num <= N; num = num + 2) {
            System.out.print(two + " ");
            two = two * 2;

            if (num + 1 <= N) {
                System.out.print(three + " ");
                three = three * 3;
            }
        }
    }
}
