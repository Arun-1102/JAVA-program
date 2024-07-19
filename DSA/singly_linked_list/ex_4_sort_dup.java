package DSA;
import java.util.*;
public class ex_4_sort_dup{
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
    ex_4_sort_dup(){
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
    public void sort(){
        if (head ==null || head.next == null){
            return;
        }
        else{
            Node current, index;
            int temp ;
            
            for(current = head ;current.next !=null ;current = current.next){
                for(index = current.next ; index != null; index= index.next ){
                    if(current.data > index.data){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }
    public void dup(){
        Node current = head;
        
        while (current != null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        
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
        ex_4_sort_dup list = new ex_4_sort_dup();
        System.out.print("Enter the no.of nodes : ");
        int m = sc.nextInt();
        for(int i =0 ; i<m;i++){
            System.out.print("Enter the value : ");
            int val = sc.nextInt();
            list.insertend(val);
        }
        list.sort();  System.out.print("Sorting of all Nodes : \n"); 
        list.display();
        list.dup();
        System.out.print("\nRemoval of Duplicate numbers in the Nodes : \n"); 
        list.display();}
}


