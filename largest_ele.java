import java.util.*;
class largest_ele
{
  static int largest_ele(int arr[], int size)
  {
    int ind,max=arr[0];
    for(ind=0; ind<size; ind++)
    {
      if(arr[ind] > max)
        max = arr[ind];
    }
    return max;
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0; ind<size; ind++)
      arr[ind]=sc.nextInt();
    System.out.printf("%d",largest_ele(arr,size));
  }
}