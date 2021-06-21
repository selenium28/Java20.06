package exception;

public class ExceptionClass {

	public static void main(String[] args) {
		int x=2;
		int y=10;
		
//		System.out.println(y/x);
		try {
			System.out.println(y/x);
		}catch (Exception e) {
			System.out.println("ArithmeticException");
			
		}
		
		System.out.println("After Exception");
	}

}
