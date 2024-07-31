package DSA.Queue;
import java.util.*;
public class priority_queue {
    node head;
    class node{
        int data;
        int pri;
        node next;
        node(int val,int p){
            data=val;
            pri=p;
            next=null;
        }
    }
    priority_queue(){
        head=null;
    }
    void enqueue(int val,int pri){
        node nn=new node(val,pri);
        if(head==null)
        head=nn;
        else{
            if(head.pri>pri){
                nn.next=head;
                head=nn;
            }
            else{
                node temp=head;
                while(temp.next!=null && temp.next.pri > pri ){
                    temp=temp.next;
                }
                    nn.next=temp.next;
                    temp.next=nn;
            }
        }
    } 
    void dequeue(){
        head=head.next;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        priority_queue obj=new priority_queue();
        obj.enqueue(10,5);
        obj.enqueue(30,2);
        obj.enqueue(40,6);
        obj.enqueue(50,0);
        obj.enqueue(70,3);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
