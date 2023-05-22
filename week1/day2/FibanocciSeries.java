package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		 int input = 6;
		 
		 int num1 = 0;
		 int num2 = 1;
		 System.out.println(num1);
		 System.out.println(num2);
		 for (int i = 1; i <input; i++) {
			
		
		     int sum = num1 + num2;
		     			num1= num2;
		     			num2=sum;
					
					 System.out.println(sum);
		}
		 
	}
}
