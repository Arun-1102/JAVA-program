package search_Algorithm;
import java.util.*;
public class binary_search {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }   
            Arrays.sort(arr);
            System.out.print("Enter Element to search : ");
            int k=scan.nextInt();
            boolean flag=false;
            int left=0;
            int right=size -1;
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid]==k){
                    System.out.print("Element Found at the "+mid+"th index");
                    flag=true;
                    break;
                }
                else if(k>arr[mid])
                    left=mid+1;
                else
                    right=mid-1;
            }
        if(flag==false)
        System.out.print("Element not Found ");
    }    
}
