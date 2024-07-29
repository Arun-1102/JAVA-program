class Book extends Thread{
	public void run() {
		for (int i = 1;i<=5;i++) {
			System.out.println("Mango Db");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Num extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

public class thread1 {

	public static void main(String[] args) {
		Book book = new Book();
		Num num = new Num();
		
		//book.UpdateDB();
		//num.Print();
		book.start();
		num.start();
		
		System.out.println("End of the program");
		
		
	}

}