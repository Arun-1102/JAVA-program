import java.util.*;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the range of numbers to convert into binary : ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+" = "+Integer.toBinaryString(i));
        }
    }
    }
