import java.util.*;
   
public class exception_EX1 {
    public static void main(String[] args)
    {
        String str="who would know naught of an art must learn,act,and then take his ease";
        char c;
        int k=0;
        try
        {
        for(int i=0;i<str.length();i++)
           {
            c=str.charAt(i);
            if((c=='a')||(c=='A')||(c=='e')||(c=='E')||(c=='i')||(c=='I')||(c=='o')||(c=='O')||(c=='u')||(c=='U'))
            {
                c++;
                break;

            }
            else if(c>0){
              System.out.println("String contain vowels");
              break;}
             else {  
            System.out.println("Error:String does not contain any vowels");
            break;}
            }
        }
            catch(Exception e) 
            {
             System.out.println("Program Finished");


        }
    
}
}


    
    

