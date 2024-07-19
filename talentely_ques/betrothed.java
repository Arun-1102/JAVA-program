import java.util.*;
class betrothed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long sum1 = 0;
        long sum2 = 0;
        for (long checkFactor = 1; checkFactor <= num1 / 2; checkFactor++) {
            if (num1 % checkFactor == 0) {
                sum1 += checkFactor;
            }
        }
        for (long checkFactor = 1; checkFactor <= num2 / 2; checkFactor++) {
            if (num2 % checkFactor == 0) {
                sum2 += checkFactor;
            }
        }
        if (sum1 - 1 == num2 && sum2 - 1 == num1) {
            System.out.println("Betrothed Number");
        } else {
            System.out.println("Not a Betrothed Number");
        }
    }
}