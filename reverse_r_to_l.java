import java.util.*;
public class reverse_r_to_l {
    static void print_right_to_left(int arr[],int size)
  {
    int ind;
    for(ind=size-1;ind>=0;ind--)
    {
      System.out.print(arr[ind]+" ");
    }
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind] = sc.nextInt();
    }
    print_right_to_left(arr,size);
  }
}
    

