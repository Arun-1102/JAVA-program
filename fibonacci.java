import java.util.Scanner;

public class fibonacci {
    static int fibo(int n){
        if(n<=1)
        return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        for(int i=0;i<l;i++){
            System.out.println(fibo(i));
        }
    }
    
}
