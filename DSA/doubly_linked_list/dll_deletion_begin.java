import java.util.*;
public class dll_deletion_begin {
    node head,tail;
    class node{
        int data;
        node next;
        node prev;
        node(int val){
            data=val;
            next=null;
            prev=null;
        }
    }
    dll_deletion_begin(){
        head=null;
        tail=null;
    }
    void insert(int val){
        node nn=new node(val);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
             tail.next=nn;
             nn.prev=tail;
        }
        tail=nn;
    }
    void delete_begin(){
        System.out.print("Deletion at begining \n");
        head.next.prev=null;
        head=head.next;
    }
    void delete_pos(int k){
        System.out.print("Deletion at given position  \n");
        node temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }
    void delete_end(){
        System.out.print("Deletion at end \n");
        tail.prev.next=null;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
       System.out.print("Null\n\n");
    }
   
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    dll_deletion_begin obj=new dll_deletion_begin();
    System.out.print("Enter the size of node to be created : ");
    int s=scan.nextInt();
    for(int i=0;i<s;i++){
        int val=scan.nextInt();
        obj.insert(val);
      // obj.reverse();
    }
    
    obj.delete_begin();
    obj.display();
    int k=3;
    obj.delete_pos(k);
    obj.display();
    obj.delete_end();
    obj.display();
    }
}
