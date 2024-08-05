package sorting_Algorithm;
import java.util.*;
public class insertion_sort {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=scan.nextInt();
    }
    for(int i=1;i<size;i++){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
     }
    for (int i=0;i<size;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }   
}
