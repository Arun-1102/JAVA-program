import java.util.*;
/*class count_digit
{

}*/
class armstrong 
{
public static void main(String[] args)
 {
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int count=0;
    int temp=a;
    while(temp!=0)
    {
        count++;
        temp/=10;

    }
    temp=a;
    int sum=0;
    while(temp!=0)
    {
        sum=sum+power(temp%10,count);
        temp/=10;
    }
    if(a==sum)
    System.out.print("Given number is Armstrong number");
    else
    System.out.println("Not a armstrong number");
}
public static int power(int base,int expo)
{
    int itr,res=1;
    for(itr=1;itr<=expo;itr++)
    res*=base;
    return res;
}



 }    

