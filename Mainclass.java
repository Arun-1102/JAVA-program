import java.util.*;      //example for static key


class computer
{   
     int cost=50000;
     void display()
    {
        System.out.println(cost);
    }
}
class keyboard extends computer
{
    void print()
    {
        System.out.println("I am keyboard");
    }
}
class Mainclass
{
    public static void main(String[] args)
    {
         keyboard obj=new keyboard();
         System.out.println(obj.cost);
         obj.cost=20000;
         obj.display();
         obj.print();

        //obj.display();
        //obj.print();
    }
}












