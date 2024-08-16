package DSA.Arraylist;
import java.util.*;
public class AL_Duplicte {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    while(true){
        int n=scan.nextInt();
        if(n<0) break;
        list.add(n);
    }
    System.out.println(list);
    for(int i=0;i<list.size()-1;i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)==list.get(j))
                list.remove(j);
                
        }
    }
    System.out.print(list);
}
}

