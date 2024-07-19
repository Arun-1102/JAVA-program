
import java.util.Scanner;
class prime1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num < 2) {
            System.out.println("Not a Prime Number");
            return;
        }
        int range = (int)Math.sqrt(num);
        int checkFactor;
        for (checkFactor = 2; checkFactor <= range; checkFactor++) {
            if (num % checkFactor == 0) {
                break;
            }
        }
        if (checkFactor > range) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}