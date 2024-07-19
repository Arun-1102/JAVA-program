package DSA.circular_linked_list;
import java.util.*;
class cll_sll_insertion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    cll_sll_insertion(){
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
    void insert_end(int i){
        Node nn=new Node(i);
        nn.next=head.next;
        head.next=nn;
        head=nn;
    }
    void insert_begin(int j){
        Node nn=new Node(j);
        nn.next=head.next;
        head.next=nn;
    }
    void display(){
        Node temp=head.next;
        do{
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        }
        while(temp!=head.next);
        System.out.print("Null\n\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        cll_sll_insertion boj=new cll_sll_insertion();
        while(true){
        int s=scan.nextInt();
        if(s<0)
        break;
        //int a=scan.nextInt();
        boj.insert(s);
        }
        boj.display();
        System.out.print("Entre value to insert at end :");
        int i=scan.nextInt();
        boj.insert_end(i);
        boj.display();
        System.out.print("Entre value to insert at begin :");
        int j=scan.nextInt();
        boj.insert_begin(j);
        boj.display();
    }
}


        
    

