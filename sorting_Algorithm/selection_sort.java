package sorting_Algorithm;

import java.util.Scanner;

public class selection_sort {
     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Selection Sort");
        for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
