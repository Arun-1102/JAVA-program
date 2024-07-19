package DSA;
import java.util.*;
class Linkedlist3{    //insertion
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
    Linkedlist3(){
        head = null;
    }//insert at end
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
    public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = head;
        
        for (int i =1;i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist3 list = new Linkedlist3();
        // int pos=3;
        //int k=88;
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        int pos=sc.nextInt();
        int k=sc.nextInt();

        list.position(pos, k);
        list.display();
    }
}


