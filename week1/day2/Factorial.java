package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		
		int fact = 1;
		
		for (int i = 1; i <= input; i++) {
			
			/*
			 * 1=1*1
			 * 2= 2*1
			 * 6 =3*2
			 * 24 =4*6 
			 * 120 = 5*6
			 */
						  
				fact=i*fact;

		}
		System.out.println(fact);

    
	}
}
