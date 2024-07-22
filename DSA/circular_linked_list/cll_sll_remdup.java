package DSA.circular_linked_list;

import java.util.*;
class cll_sll_remdup{
    node head;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
        }
        cll_sll_remdup(){
            head=null;
    }
    void insert(int val){
        node nn=new node(val);
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
    void remove_dup(){
       node temp=head.next;
       node tamp=head.next.next;
       do{
        if(temp==tamp){
            temp.next=tamp.next;
        }
        else{
            temp=temp.next;
            tamp=tamp.next;
        }
    }while(temp!=head.next);
       
}
    void display(){
        node temp=head.next;
        do{
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }while(temp!=head.next);
        System.out.print("Null\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        cll_sll_remdup akg=new cll_sll_remdup();
        System.out.print("Enter the no of nodes : ");
        int s=scan.nextInt();
        for(int i=0;i<s;i++){
            int val=scan.nextInt();
            akg.insert(val);
        }
        akg.display();
        akg.remove_dup();
        akg.display();
    }
}