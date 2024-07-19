import java.util.*;
public class adam {
   
  public static int sqr(int num1)
  {
      int val=num1*num1; 
	  return val;
  }
  public static int rev(int num)
  {
      int dig=0;
      while(num!=0)
  {
      int rem=num%10;
      dig=dig*10+rem;
      num=num/10;
      
  }
     int rev_val=dig;
      return rev_val;
  }

  public static void main (String[]args)
  {
	Scanner obj=new Scanner(System.in);
	System.out.print("\nenter integer value:");
	int airtel=obj.nextInt();
		System.out.print("\nentered integer value is :"+airtel);
   int sqr_num = sqr(airtel);
        System.out.print("\nsqr of num is :"+sqr_num);
   int rev_num = rev(airtel);
         System.out.print("\nreverse of num is :"+rev_num);
   int sq_rev_num = sqr(rev_num);
         System.out.print("\nsqr of reverse of num is :"+sq_rev_num);
   int rev_sq_rev_num = rev(sq_rev_num);
         System.out.print("\nrev of sqr of reverse of num is :"+rev_sq_rev_num);
   
  }
}
