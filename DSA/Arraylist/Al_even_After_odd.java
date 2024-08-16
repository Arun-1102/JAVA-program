package DSA.Arraylist;
import java.util.*;
public class Al_even_After_odd {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        while(true){
            int n=scan.nextInt();
            if(n<0) break;
            list.add(n);
        } 
          for(int i=0;i<list.size();i++){
               if(list.get(i)%2==0){
               list1.add(list.get(i));
               list.remove(i);
               }
          }
          list.addAll(list1);
          System.out.print(list);
    }
}
