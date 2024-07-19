import java.util.*;
public class exception_EX2 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        arr[i]=scan.nextInt();
        int c=0;
        try
        {
            for(int i=0;i<s;i++)
            {
                for(int j=s-1;j>=0;j--)
                {
                if(arr[i]==arr[j])
                c++;
                int d=arr[j];
                break;
                }
             
             if(c==0){
             System.out.print("No elements found");
             break;}
             else{
             System.out.print("ERROR!: Duplicate number found");
             break;}
             
            }  
               
         }
          catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           
         }
        
    }
    
}
