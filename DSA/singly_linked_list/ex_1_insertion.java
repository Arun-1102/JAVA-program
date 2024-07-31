package DSA.singly_linked_list;

import java.util.Scanner;

public class ex_1_insertion{
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
    ex_1_insertion(){
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
    void insert_at_begining(int b){
        Node newnode=new Node(b);
        if(head==null)
        head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = head;
        
        for (int i =1;i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        ex_1_insertion  obj= new ex_1_insertion();
        System.out.print("Enter the no.of nodes : ");
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            System.out.print("Enter the value : ");
            int val = sc.nextInt();
            obj.insertend(val);
        }
        obj.display();
        System.out.print("Enter the value to insert at begining : ");
        int b=sc.nextInt();
        obj.insert_at_begining(b);
        obj.display();
        System.out.print("Enter the position : ");
        int pos=sc.nextInt();
        System.out.print("Enter the value to insert at the position : ");
        int k=sc.nextInt();
        obj.position(pos,k);

        obj.display();

    }

}

