
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class range_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        // Use a sufficiently large limit to ensure we cover the first 100,000 primes
        int limit = 2000000; // This limit is arbitrary but should be sufficient for 100,000 primes
        List<Integer> primes = sieveOfEratosthenes(limit);

        // Extract the primes from nth to mth and reverse the list
        List<Integer> result = primes.subList(n - 1, m); // n-1 because list is 0-indexed
        Collections.reverse(result);

        // Print the result
        for (int prime : result) {
            System.out.print(prime + " ");
        }
    }

    private static List<Integer> sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}

