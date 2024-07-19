import java.util.*;
class Search_element
{
  static int Search_element(int arr[], int size,int ele)
  {
    int ind;
    for(ind=0; ind<size; ind++)
    {
      if(arr[ind] == ele)
        return 1;
    }
    return 0;
  }
  public static void main(String[] args)
  {
    int ind,size,ele;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter the size : ");
    size = sc.nextInt();
    System.out.println("Enter the value : ");
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
      arr[ind]=sc.nextInt();
      System.out.println("Enter the element : ");
    ele = sc.nextInt();
    if(Search_element(arr,size,ele) == 1)
      System.out.print("Found");
    else
      System.out.print("Not found");
  }
}