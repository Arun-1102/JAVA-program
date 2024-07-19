class college     //   exmaple for the super key 
{
     int code=7321;   //by using super we can not change the value in the variable
    void print()
    {
        System.out.println(" This is my coolege code"+code);
    }
}
class nandha extends college
{
    int code=8756;
   void print1()
   {
    System.out.println("Nandha college of Technolgy1 "+code);
    System.out.println("Nandha college of Technolgy2 "+super.code);
   }
}




class keysuper
{
    public static void main(String[] args)
   {
    nandha obj=new nandha();
   // college obj1=new college();
   // obj.print();
    obj.print1();
    //obj.print();

   }
}
