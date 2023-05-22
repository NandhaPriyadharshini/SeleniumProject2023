package week1.day2;

public class PracticeForIfSwitch {
	
	
	
	public static void main(String[] args) {
		
		int xy = 87;
		for (int i = 0; i <= xy; i++) {
			if (i>50) {
				
				System.out.println("greater than 50");
			}
				switch (xy) {
				case 86:
					System.out.println("86");
					break;
				case 87:
					System.out.println("87");

				default:
					System.out.println("i am default");
					break;
				}
				
			
			
		}
		
	}

}
