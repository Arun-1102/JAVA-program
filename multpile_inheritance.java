import java.util.*;
class arithmetic
{
    Scanner scan=new Scanner(System.in);
  // System.out.print("a=");
   int a=scan.nextInt();
   //System.out.println("b=");
   int b=scan.nextInt();
    //int a=10;
    //int b=20;
   
    void display()
    {
        
        System.out.println("values are given below");
    }
}
class add extends  arithmetic
{
    void display1()
    {
        System.out.println("adttion\t\t"+(a+b));
    }
}
class sub extends add
{
    void display2()
    {
        System.out.println("subtraction\t"+(a-b));
    }
}
class mul extends sub
{
    void display3()
    {
        System.out.println("multiplication\t"+(a*b));
    }
}
class div extends mul
{
    void display4()
    {
        System.out.println("division\t"+(a/b));
    }
}

    class multiple_inheritance {
        public static void main(String[] args)
        {
            
            div obj=new div();
            obj.display();
            obj.display1();
            obj.display2();
            obj.display3();
            obj.display4();
        }


    
}
