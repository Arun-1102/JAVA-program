import java.util.*;
public class dll_palindrome {
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
    dll_palindrome(){
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
        int c=0;
        node temp=head;
        while(temp!=null){
           if(temp.data!=tail.data){
            c=1;
            break;
           }
           else{
            temp=temp.next;
            tail=tail.prev;
           }
        }
        if(c==0)
       System.out.print("\nYes");
       else
       System.out.print("\nNo");
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
    dll_palindrome obj=new dll_palindrome();
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
