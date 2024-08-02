
    import java.util.*;
class palindrome
{
    public static char[] append(String s)
    {
        int l =s.length();
        int j=l-1,count=0;
        for(int i =0;i<l;i++)
        {
            while(s.charAt(i)!=s.charAt(j))
            {
                i++;
                count++;
            }
            j--;   
        }
        StringBuffer str=new StringBuffer(s.substring(0,count));
String st=str.toString();
        char[] pali = st.toCharArray();
        return pali;
    }public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=append(s);
        for (int i = ch.length-1; i >= 0 ; i--)
        {
            System.out.print(ch[i]);
        }
    }
}


    

