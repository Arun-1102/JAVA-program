import java.util.*;
public class darr {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int r=scan.nextInt();
        System.out.print("Enter the size of column : ");
        int c=scan.nextInt();
        int arr[][]=new int[r][c];
       // int arr2[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               // arr2[j]=scan.nextInt(); 
System.out.printf(arr[i][j]+" ");}
System.out.println();
    }
    }
}
