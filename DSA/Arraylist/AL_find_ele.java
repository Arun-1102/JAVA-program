package DSA.Arraylist;
import java.util.*;
public class AL_find_ele {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int n=scan.nextInt();
            if(n<0) break;
            list.add(n);
        }
        int k=scan.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i)==k){
                System.out.print("Element found at the index of"+i);
                break;
            }
        }
    }
}
