package DSA.Graph;
import java.util.*;
public class graph_array {
    
    void insert(int u,int v,int[][] arr){
        arr[u][v]=1;
        arr[v][u]=1;
    }
    void display(int s,int[][] arr){
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void show(int[][] arr,char[] c,int s){
        for(int i=0;i<s;i++){
            System.out.print(c[i]+"--> ");
            for(int j=0;j<s;j++){
                if(arr[i][j]==1)
                  System.out.print(c[j]); 
            }
              System.out.println();
        }
    }
    void bfs(int v,int s,int[][] arr){
        System.out.print(v);
        for(int i=0;i<s;i++){
            if(arr[v][i]==1)
                System.out.print(i);
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        graph_array ga=new graph_array();
        int s=scan.nextInt();
        char[] c=new char[s];
        for(int i=0;i<s;i++)
            c[i]=scan.next().charAt(0);
        int[][] arr=new int[s][s];
        for(int i=0;i<s;i++){
        int v1=scan.nextInt();
        int v2=scan.nextInt();
            ga.insert(v1,v2,arr);
    }
    ga.display(s,arr);
    ga.show(arr,c,s);
    ga.bfs(3,s,arr);
} 
} 

