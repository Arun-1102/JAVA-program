import java.util.*;
 class exception1 {

	public static void main(String[] args) {
		int a = 30, b = 0;
		int c = 0;
		
		try {
			int arr[] = null;
			System.out.println(arr[4]);/////
			
			c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured");
			
		}
		catch (NullPointerException e) {
			System.out.println("Index Not found");
		}
		finally {
			int fact = 1;
			for (int i =1;i<=5;i++) {
				fact = fact*i;
				
			}
			System.out.println(fact);
		}
		
		System.out.println(c);
		System.out.println("End of the program");

	}

}