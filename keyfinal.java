class college     //   exmaple for the finalkey 
{
    final int code=7321;   //by using final we can not change the value in the variable
    void print()
    {
        System.out.println(" This is my coolege code"+code);
    }
}
class nandha extends college
{
   void print1()
   {
    System.out.println("Nandha college of Technolgy");
   }
}



public class keyfinal
{
    public static void main(String[] args)
   {
    nandha obj=new nandha();
   // college obj1=new college();
    obj.print();
    obj.print1();
    //obj1.code=8374;
    obj.print();

   }
}
