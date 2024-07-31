
package DSA.singly_linked_list;

import java.util.Scanner;

public class ex_2_deletion{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    ex_2_deletion(){
        head = null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
     void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    void delete_at_begining(){
      head=head.next;
      System.out.println();
    }
    void position(int pos){
        Node temp = head;
        Node prev = null;
        
        for(int i=1;i<pos;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        }
        void delete_end(){
            Node temp=head;
           // Node prev = null;
            while(temp.next.next!=null){
               // prev = temp;
                temp=temp.next;
            }
            temp.next=null;
                
        }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        ex_2_deletion  obj= new ex_2_deletion();
        System.out.print("Enter the no.of nodes : ");
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            System.out.print("Enter the value : ");
            int val = sc.nextInt();
            obj.insertend(val);
        }
        obj.display();
        System.out.print("After deleting the value at begining : ");
        obj.delete_at_begining();
        obj.display();
        System.out.print("Enter the position to delete  : ");
        int pos=sc.nextInt();
        obj.position(pos);
        System.out.print("After deleting the value at end  : ");
        obj.delete_end();
        obj.display();

    }

}

