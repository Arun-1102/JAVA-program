import java.util.Scanner;
class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                  
        int n = scanner.nextInt();
        for (int row = 1; row <= n; row++) 
        {
            for (int col = row; col < n; col++) 
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2) - 1; col++)
             {
                System.out.print("*");
             }
            System.out.println();
        }
        for (int row = 5; row >= 1; row--) 
        {
            for (int col = row; col < n; col++) 
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2) - 1; col++)
             {
                System.out.print("*");
             }
            System.out.println();
        }
    }
}
              
                      
                        
                      
