package DSA;
import java.util.*;
class linkedlist1{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  linkedlist1(){
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

    
  

public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  linkedlist1 obj=new linkedlist1();
  int s=scan.nextInt();
  for(int i=0;i<s;i++)
  {
    int val=scan.nextInt();
    obj.insert(val);
  }
  obj.display();
}
}
