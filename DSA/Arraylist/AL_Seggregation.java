package DSA.Arraylist;
import java.util.*;
public class AL_Seggregation {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        while(true){
            int n=scan.nextInt();
            if(n<0) break;
            list.add(n);
        } 
          for(int i=0;i<list.size();i++){
                if(list.get(i)==1){
                list1.add(list.get(i));
                    list.remove(i);
                }
                if(list.get(i)==2){
                    list2.add(list.get(i));
                    list.remove(i);
                }

}
list.addAll(list1);
list.addAll(list2);
System.out.print(list);
    }
}
