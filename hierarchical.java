import java.util.*;
class arithmetic      //parent class
{
    
    int a=10;
    int b=20;
   
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
class sub extends arithmetic
{
    void display2()
    {
        System.out.println("subtraction\t"+(a-b));
    }
}

    class hierarchical {
        public static void main(String[] args)
        {
            
            
            add obj1=new add();
            obj1.display1();
            sub obj2=new sub();
            obj2.display2();
             
            obj2.display();
        }



    
}
// want to correct the program
