import java.util.*;
class Student
{
    int roll_no;
    String name;
     void assign_value(int a,String b)
    {
        roll_no=a;
        name=b;
    
   
        System.out.println("Your roll_no and name is :"+a+" "+ b);
       
    }
    
    

}
public class class_example {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Student st=new Student();
    Student st1=new Student();
    System.out.print("Enter the roll no : ");
    int a=scan.nextInt();
    int a1=scan.nextInt();
    System.out.print("Enter the name : ");
    String b=scan.nextLine();
    String b1=scan.nextLine();
    

    
   // System.out.println(st.roll_no+"\n"+st.name);
st1.assign_value(a,b);
st.assign_value(a1,b1);
//st.display();
}
}
