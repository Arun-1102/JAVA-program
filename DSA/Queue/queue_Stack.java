package DSA.Queue;
import java.util.*;
public class queue_Stack {
    static int front=-1;
    static int rear=-1;
     public static void enqueue(int val,int[] arr){
       
            if(front==-1)
            front++;
            arr[++rear]=val;
    }
    static void dequeue(int[] arr){
        if(front==-1)
        System.out.print("Queue is empty");
        front=front++;
    }
    public static void display(int[] arr){
         while(front!=rear){
                System.out.print(+arr[++front]+"\t");
            }
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            int val=scan.nextInt();
            enqueue(val,arr);
        }
        dequeue(arr);
        display(arr);
    }
}
