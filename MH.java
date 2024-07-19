class gf          //example for multi and hybrid class in java
{
    void print()
    {
        System.out.println("I am grandfther");
    }
}
class f extends gf 
{
   void print1()
   {
    System.out.println("I am father");
   } 
 
}
class son extends f
{
    void print2()
    {
        System.out.println("I am son");
    }
}
class gs extends son{
    void print3()
    {
        System.out.println("I am grand son");
    }
}
class gd extends son{
    void print4()
    {
        System.out.println("I am grand daughter");
    }
}
class MH
{
    public static void main(String[] args) {
        gs obj= new gs();
        obj.print();
        obj.print1();
        obj.print2();
        obj.print3();
        gd obj1=new gd();

        obj1.print4();

    }
}



