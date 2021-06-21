package basicJava;

public class DataTypesClass {
	
	//main()method --> starting/execution point of the program
	public static void main(String[] args) {
		
		//Primitive data types: int, double, char and boolean.
		//Non-Primitive data types: String an Array.
		
		// DataTypes 1. int 
		int a = 20;   // int-dataTypes, i-variable, 20-value.
		int b = 10;
		int k = 40;
		int d = 12;
		System.out.println(a+d);
		System.out.println("Adding k and a = " + (k+a));
		
		//2. double
		double p = 12;
		double q = 33.33;
		System.out.println(q);
		
		//3.char:only single digit value, should be written in single quote.
		char c = 'a';
		char c1 = 'A';
		char c2 = '$';
		System.out.println(c1);
		
		//4.boolean: // it's return true or false
		boolean b1 = true;
		boolean b2 = false;
		
		//5. String - is a Class, not a datatype
		String s = "Hello World";
		String s1 = "JAVA";
		String s3 = "123.123";
		
	}

	
}