package oops;

public class OopsBasicClass {
	//main method-->Starting point of execution
	public static void main(String[] args) {
		OopsBasicClass obj = new OopsBasicClass();
		obj.adidas();
		int sum = obj.reebok();
		System.out.println(sum);
		String str = obj.puma();
		System.out.println(str);
		double b = obj.division(1000, 7);
		System.out.println(b);
	}

	//Non-static methods
	//return type - void --> does not return any value
	public void adidas() { // no input, no output
		System.out.println("Adidas Method");
	}

	//Non-static methods
	//return type - int --> it's return int value
	public int reebok() { // no input, some output
		System.out.println("Reebok Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;	
	}

	//Non-static methods
	//return type - String --> it's return String value
	public String puma() { // no input, some output
		System.out.println("Puma Method");
		String s1 = "Selenium";
		return s1;

	}

	//Non-static methods
	//return type - double --> it's return decimal value
	public double division(int x, int y) { //some input, some output
		double d = x/y;
		return d;

	}

}
