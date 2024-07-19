class parent
{
    void display()
    {
        System.out.println("I am parent");
    }
}
class child extends parent{
    void print()
    {
        System.out.println("I am child");
    }
}
class class_derive
{
    public static void main(String[] args)
    {
         child obj=new child();
        obj.display();
        obj.print();
    }
}