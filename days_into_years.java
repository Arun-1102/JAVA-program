import java.util.Scanner;
class days_into_yeras
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long Days = scanner.nextLong();
        long year = Days / 365;
        long remainingDays = Days % 365;
        long week = remainingDays / 7;
        long days = remainingDays % 7;
        System.out.println("Number of Years:"+year);
        System.out.println("Number of Week:"+week);
        System.out.println("Number of Days:"+days);
    }
}