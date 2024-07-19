import java.util.*;
class sum_of_arr
{
  static int sum_of_ele(int arr[], int size)
  {
    int ind,sum=0;
    for(ind=0; ind<size; ind++)
    {
      sum = sum + arr[ind];
    }
    return sum;
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
    System.out.printf("\n %d",sum_of_ele(arr,size));
  }
}