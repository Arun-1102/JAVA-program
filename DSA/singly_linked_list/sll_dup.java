package DSA;
import java.util.*;
class sll_dup{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  sll_dup(){
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
 void duplicate(){
    Node current = head;
        
    while (current != null && current.next != null){
        if (current.data == current.next.data){
            current.next = current.next.next;
        }
        else{
            current = current.next;
        }
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

    
  

public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  sll_dup obj=new sll_dup();
  int s=scan.nextInt();
  for(int i=0;i<s;i++)
  {
    int val=scan.nextInt();
    obj.insert(val);
  }
  obj.duplicate();
  obj.display();
}
}
