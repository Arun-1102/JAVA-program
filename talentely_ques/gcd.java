import java.util.Scanner;
 class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = 1;
        for (int fact = 1; fact <= num1 && fact <= num2; fact++) {
            if (num1 % fact == 0 && num2 % fact == 0) {
                gcd = fact;
            }
        }
        System.out.println(gcd);
    }
}