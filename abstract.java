import java.util.*;
abstract class computer
{
    abstract void output();
    void display()
    {
        System.out.println(" I am abstract class");
    }

}
class keyboard extends computer
{
    void output()
    {
        System.out.println("I will display");
    }
    void display1()
    {
        System.out.println("I am typing");
    }

 abstract 
{
    public static void main(String[] args)
    {
        keyboard obj=new keyboard();

    }
    
}
}
