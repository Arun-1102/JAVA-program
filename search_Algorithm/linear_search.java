package search_Algorithm;
import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter Element to search : ");
        int k=scan.nextInt();
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(arr[i]==k){
                flag=true;
                System.out.print("Elemext found at the index of "+i+"th");
                break;
            }
        }
        if(flag==false)
        System.out.print("Element not Found");
    }
}
