package DSA;
import java.util.*;
public class sll_min_max {
    Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  sll_min_max(){
    head=null;
  }
  public void insert(int val){
    Node newnode=new Node(val);
    if(head==null)
    head=newnode;
    else{
      Node temp=head;
      while(temp.next!=null){
      temp=temp.next;}
      temp.next=newnode;
    }
 }
 void display(){
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data+" ==> ");
    temp=temp.next;
  }
  System.out.print("Null");
 }
 void tofind(){
    Node temp=head;
    int max=0;
    while(temp!=null){
        if(max<temp.data){
            max=temp.data;}
            temp=temp.next;
        }
        //Node temp=head;
        int c=head.data;
        while(temp!=null){
              if(c>temp.data){
                c=temp.data;}
                temp=temp.next;
            }
        System.out.print("\n"+"Maximum value ==>"+max);
        System.out.println("\n"+"Minimum value ==>"+c); //mistake
    
 }

    
  

public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  sll_min_max obj=new sll_min_max();
  int s=scan.nextInt();
  for(int i=0;i<s;i++)
  {
    int val=scan.nextInt();
    obj.insert(val);
  }
  obj.display();
  obj.tofind();
}
}

    

