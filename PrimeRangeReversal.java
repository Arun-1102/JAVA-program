import java.util.Scanner;

class ContinuousDigitPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        scanner.close();
        
        int count = 0;
        long previousDigit = input % 10;
        input /= 10;

        while (input > 0) {
            long currentDigit = input % 10;
            if (Math.abs(currentDigit - previousDigit) == 1) {
                count++;
            }
            previousDigit = currentDigit;
            input /= 10;
        }

        System.out.println(count);
    }
}