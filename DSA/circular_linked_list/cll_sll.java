package DSA.circular_linked_list;
import java.util.*;
class cll_sll{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    cll_sll(){
        head=null;
    }
    void insert(int a){
        Node nn=new Node(a);
        if(head==null){
        nn.next=nn;
        head=nn;
        }
        else{
           nn.next=head.next;
           head.next=nn;
           head=nn;
        }
    }
    void display(){
        Node temp=head.next;
        do{
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        }
        while(temp!=head.next);
        System.out.print("Null");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        cll_sll boj=new cll_sll();
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


        
    
