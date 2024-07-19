
import java.util.*;
class main
{
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int res;
    if(a>=2 && a<=20)
    {
      for(int i=1;i<=10;i++)
      {
          res=0;
          res=a*i;
          System.out.printf("%d x %d = %d",a,i,res);
          System.out.println();
      }  
    }
}
}