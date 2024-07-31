package DSA.Queue;
import java.util.*;
public class queue_list {
    node front;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    queue_list(){
        front=null;
    }
    void enqueue(int val){
        node nn=new node(val);
        if(front==null){
            front=nn;
        }
        else{
           node temp=front;
           while(temp.next!=null){
                temp=temp.next;
           } 
           temp.next=nn;
        }
    }
    void dequeue(){
       front=front.next;
    }
    void display(){
        node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        queue_list obj=new queue_list();
        int size=scan.nextInt();
        for(int i=0;i<size;i++){
            int val=scan.nextInt();
            obj.enqueue(val);
    }
    obj.display();
    obj.dequeue();
    obj.display();
}
}
