import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double sum=0;
        String s=scan.nextLine();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++){
            double d=((double)arr[i]);
                sum=sum+d;
        }
        double avg=sum/s.length();
        System.out.print(avg);
    }
}
