import java.util.Scanner;
class seconds_into_time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalseconds = scanner.nextInt();
        int hours = totalseconds / 3600;
        int remainingSeconds = totalseconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.printf("%02d:HOUR %02dMIN :%02dSEC%n",hours, minutes, seconds);
    }
}