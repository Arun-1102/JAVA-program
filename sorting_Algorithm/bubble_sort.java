package sorting_Algorithm;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int j=1;j<=size;j++){
        for(int i=0;i<size-1;i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        }
        System.out.print("Iteration : "+j+"\n");
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }    
    System.out.println("\nBuuble Sort");
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
