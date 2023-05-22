package week1.day2;

public class PrintEvenNumbers {
	
public static void main(String[] args) {
	
 int n = 50;
	 
	 for (int i = 0; i <= n; i++) {
		
		 if (i%2==0) {
			
			 System.out.println("i is even "+i);

		}else if (i%2==1) {
			
			 System.out.println("i is odd "+i);

		}
	 }
}
}
