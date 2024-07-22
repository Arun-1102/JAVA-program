package DSA.circular_linked_list;

import java.util.*;

public class cll_sll_sort {
    node head;
    class node{
        int data;
        node next;
        node(int val){
            data=val;
            next=null;
        }
    }
    cll_sll_sort(){
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
void sort(){
        node current = head;
        node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            do {
                index = current.next;
                while (index != head) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data; 
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            } while (current != head);
        }
        node tem=head;
        do{
            System.out.print(head.data+" --> ");
            head=head.next;
        }while(head!=tem);
        System.out.print("Null\n\n");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        cll_sll_sort l=new cll_sll_sort();
        while(true){
            int val=scan.nextInt();
            if(val<0)
            break;
            //int a=scan.nextInt();
            l.insert(val);
            }
            
            l.sort();
           
    }
    }

    

