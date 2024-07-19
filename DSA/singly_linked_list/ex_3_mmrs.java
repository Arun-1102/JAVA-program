package DSA;
import java.util.*;
public class ex_3_mmrs{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;}}
    ex_3_mmrs(){
        head = null;}
    public void insertend(int val){
        Node newnode = new Node(val);     
        if (head==null)
            head = newnode;
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;}
            temp.next = newnode;}}
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"==>");
            temp = temp.next;       }
        System.out.print("Null\n");}
    public void min(){    
        int min=head.data;
        Node temp=head;
        while (temp != null){
            if (min>temp.data) {
            min=temp.data;}
            temp=temp.next;}
    System.out.println("\nMIN = :"+min);}
    public void max(){    
        int max=head.data;
        Node temp=head;
        while (temp != null){
            if (max<temp.data) {
            max=temp.data;}
            temp=temp.next;}
    System.out.println("\nMAX = :"+max);}
public void reverse(){
    Node prev = null;
    Node current = head;
    while (current != null){
        Node next = current.next ;
        current.next = prev;
        prev = current;
        current = next; }
    head = prev;}
public void search(int a){
    Node temp=head;
    while(temp!=null){
    if(temp.data==a){
    System.out.print("The element found");
    break;}
    temp=temp.next;}
       
}
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        ex_3_mmrs list = new ex_3_mmrs();
        System.out.print("Enter the no.of node : ");
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);}
            System.out.println("Enter the value to search among the nodes : ");
            int a=sc.nextInt();
        list.search(a);
        list.max();list.display();
        list.min();list.display();
        list.reverse();System.out.println("\nReversed value of the Node : ");list.display();
     }
    }