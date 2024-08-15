package DSA.Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class graph_dfs {
     ArrayList<ArrayList<Integer>> list=new ArrayList<>();
     graph_dfs(int c){
        for(int i=0;i<c;i++)
        list.add(new ArrayList<Integer>());
    }
    void push(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    void display(){
        for (int i=0;i<list.size();i++){
            System.out.println("\nVertices --> "+i);
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
        }
    }
    void dfs(int v){
        int s=list.size();
        boolean[] arr=new boolean[s];
        dfs1(v,arr);
    }
     void dfs1(int v, boolean[] arr) {
        System.out.print(v+" ");
        
        arr[v]=true;
        for(int i=0;i<list.get(v).size();i++){
            int k=list.get(v).get(i);
            if(!arr[k])
            dfs1(k,arr);
        }
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        graph_dfs g1=new graph_dfs(5);
        g1.push(0,1);
        g1.push(0,2);
        g1.push(1,2);
        g1.push(1,3);
        g1.push(2,3);
        g1.push(0,4);
            g1.display();
            System.out.println();
            int v=scan.nextInt();
            g1.dfs(v);
        
    }
    
}

