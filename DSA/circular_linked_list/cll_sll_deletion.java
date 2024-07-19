package DSA.circular_linked_list;
import java.util.*;
class cll_sll_deletion {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    cll_sll_deletion(){
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
    void delete_end(){
       Node temp=head.next;
       temp=null;
    }
   /*  void delete_begin(){
        Node nn=new Node(j);
        nn.next=head.next;
        head.next=nn;
    }*/
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
        cll_sll_deletion boj=new cll_sll_deletion();
        while(true){
        int s=scan.nextInt();
        if(s<0)
        break;
        //int a=scan.nextInt();
        boj.insert(s);
        }
        boj.display();
        //System.out.print("Entre value to delete at end :");
        //int i=scan.nextInt();
        boj.delete_end();
        boj.display();
        //System.out.print("Entre value to delete at begin :");
        //int j=scan.nextInt();
        //boj.delete_begin(j);
        //boj.display();
    }
}


        
    

