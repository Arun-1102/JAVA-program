package Array;
import java.util.*;

class array {
   
    public static void main(String[] args){
    
   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Elements in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Reversed elements in the array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of the elements in the array: " + sum);

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element in the array: " + max);

        Arrays.sort(arr);
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
}

}