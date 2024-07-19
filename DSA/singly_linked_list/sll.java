package DSA;
import java.util.*;
class sll{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    sll(){
        head=null;
    }
    void insert(int a){
        Node nn=new Node(a);
        if(head==null)
        head=nn;
        else{
            Node temp=head;
            while(temp.next!=null)
            temp=temp.next;
            temp.next=nn;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ==> ");
        temp=temp.next;}
        System.out.print("Null");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        sll boj=new sll();
        while(true){
        int s=scan.nextInt();
        if(s<0)
        break;
        //int a=scan.nextInt();
        boj.insert(s);
        }
        boj.display();
    }
}


        
    
