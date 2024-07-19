import java.lang.String;
import java.util.*;
class string1
{
    public static void main(String[] args)//String[] args is a sting constructor
     {    
    
       Scanner scan=new Scanner(System.in);
       String str=scan.nextLine();
       System.out.println(" ");
       for(int i=0;i<str.length();i++)
       {
        char v=str.charAt(i);
        if(v=='a' ||v== 'e'||v=='i'||v=='o'||v=='u')

        System.out.printf("%s\t",v);
       }
       
       // System.out.print(str.charAt(i)+" ");
}}