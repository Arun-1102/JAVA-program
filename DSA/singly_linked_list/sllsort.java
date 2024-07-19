//package DSA;
import java.util.*;
class sllsort{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  sllsort(){
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
 void sort(){
  if(head==null||head.next==null)
  return;
  else{
    Node current,index;
    int temp;
    for(current=head;current.next!=null;current=current.next){
      for(index=current.next;index!=null;index=index.next){
        if(current.data>index.data){
          temp=current.data;
          current.data=index.data;
          index.data=temp;
        }
      }
    }
  }
 }
public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  sllsort obj=new sllsort();
  int s=scan.nextInt();
  for(int i=0;i<s;i++)
  {
    int val=scan.nextInt();
    obj.insert(val);
  }
  obj.sort();
  obj.display();
}
}
