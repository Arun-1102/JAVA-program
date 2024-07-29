import java.util.*;
import java.lang.Math;
public class prime {
    public static int find_prime(int n){
        int c=1;
          for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0)
                c++;
          }
          return c;
        }
    public static void main(String[] args){
        System.out.print("Enter the Number : ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
       if(1==find_prime(num))
       System.out.print("The give number is Prime number "+num);
        else
        System.out.println("The give number is not Prime number "+num);
}
}
