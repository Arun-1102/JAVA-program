package DSA.Graph;
import java.util.*;
public class graph_insertion {
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    graph_insertion(int c){
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
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        graph_insertion g1=new graph_insertion(5);
        g1.push(0,1);
        g1.push(0,2);
        g1.push(1,2);
        g1.push(1,3);
        g1.push(2,3);
        g1.push(0,4);
            g1.display();
        
    }
    
}
