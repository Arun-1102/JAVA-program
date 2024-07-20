package DSA.circular_linked_list;
import java.util.*;
class cll_sll_minmax{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
            next=null;
        }
    }
    cll_sll_minmax(){
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
    void min_max(){
        int c=head.data;
        Node temp=head.next;
        int max=0;
        while(temp!=head.next){
            if(c>temp.data)
            c=temp.data;
            temp=temp.next;
        }
             while(temp!=head){
                  if(max<temp.data){
                  max=temp.data;}
            temp=temp.next;
        }     
             System.out.print("\n Minimum vale of the node : "+c);
             System.out.print("\n Maximum vale of the node : "+max);
        }
        void display(){
        Node temp=head.next;
        do{
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        }
        while(temp!=head.next);
        System.out.print("Null\t");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        cll_sll_minmax boj=new cll_sll_minmax();
        while(true){
        int s=scan.nextInt();
        if(s<0)
        break;
        //int a=scan.nextInt();
        boj.insert(s);
        }
        boj.display();
       boj.min_max();
    }
}


        
    
