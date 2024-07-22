package DSA.Stack;

import java.util.*;
class stack_sll{
    node head;
    node peak;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    stack_sll(){
        head=null;
        peak=null;
    }
    void insert(int val){
        node nn=new node(val);
        if(head==null){
        head=nn;
        peak=nn;}
    else{
        peak.next=nn;
        peak=nn;
} }
void del(){
    node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    peak=temp;
}
void display(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("\n Peak is : "+peak.data+"\n\n");
}
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    stack_sll s=new stack_sll();
    System.out.print("Enter the no.of nodes : ");
    int a=scan.nextInt();
    for(int i=0;i<a;i++){
        int val=scan.nextInt();
        s.insert(val);
    }
    s.display();
    s.del();
    s.display();
}
}