import java.util.*;
class keybutton {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int res=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='A'||c=='D'||c=='G'||c=='J'||c=='M'||c=='P'||c=='T'||c=='W')
            res=res+1;
            else if(c=='B'||c=='E'||c=='H'||c=='K'||c=='N'||c=='Q'||c=='U'||c=='X')
            res=res+2;
            else if(c=='C'||c=='F'||c=='I'||c=='L'||c=='O'||c=='R'||c=='V'||c=='Y')
            res=res+3;
            else 
            res=res+4;

        }
        System.out.println(res);

    }
    
}
