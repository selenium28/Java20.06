package basicJava;

public class StringConcatination {
	// + : is concatenation operator 

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Selenium";
		
		double c = 12.50;
		double d = 33.50;
		
		System.out.println(a+b);  //300
		System.out.println(x+y);  //HelloSelenium
		
		System.out.println(a+b+x+y);  //300HelloSelenium
		System.out.println(x+y+a+b);  //HelloSelenium100200
		
		System.out.println(x+y+(a+b)); //HelloSelenium300
		System.out.println(a+b+x+y+a+x+b+y); //300HelloSelenium100Hello200Selenium
		
		System.out.println(c+d);  // 46.0
		System.out.println(x+y+c+d); // HelloSelenium12.5033.50

	}

}
