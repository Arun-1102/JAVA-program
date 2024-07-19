import java.util.*;
class count_odd_even
{
  static void count_odd_even(int arr[],int size)
  {
    int ind,even=0,odd=0;
    for(ind=size-1;ind>=0;ind--)
    {
      if(arr[ind]%2==0)
        even++;
      else
        odd++;
    }
    System.out.printf("Odd = %d\nEven = %d",odd,even);
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
    count_odd_even(arr,size);
  }
}