import java.util.*;
class count_zeros_ones
{
  static void count_zeros_ones(int arr[],int size)
  {
    int count1=0,count2=0;
    for(int ind=0;ind<size;ind++)
    {
      if(arr[ind]==1)
       count1+=1;
      else
       count2+=1;
    }
    System.out.printf("zc = %d"+count1);
    System.out.printf("oc = %d"+count2);
    
    
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
    count_zeros_ones(arr,size);
  }
}