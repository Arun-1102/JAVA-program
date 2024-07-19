
import java.util.*;
class dll{
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
    dll(){
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
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
       System.out.print("Null");
    }
   /*  void reverse(){
        node temp=tail;
        while(tail!=null){
            System.out.print(tail.data);
            tail=tail.prev;
        }
    }*/
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    dll obj=new dll();
    System.out.print("Enter the size of node to be created : ");
    int s=scan.nextInt();
    for(int i=0;i<s;i++){
        int val=scan.nextInt();
        obj.insert(val);
      // obj.reverse();
    }
    obj.display();
    }
}
