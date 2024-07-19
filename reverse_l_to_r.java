import java.util.*;
public class reverse_l_to_r {
  static void print_left_to_right(int arr[],int size)
  {
    int ind;
    for(ind=0;ind<size;ind++)
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
    print_left_to_right(arr,size);
  }
}