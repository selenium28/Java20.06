package basicJava;

public class StaticAndNonStatic {
	//Global vars: the scope of global vars will be available across all the methods with some conditions.
	String name = "Dev"; // non static global var
	static int age = 25; //static global var

	public static void main(String[] args) {
		//how to call static methods and variables?
		//1. direct calling
		add();
		//2. calling by class name 
		StaticAndNonStatic.add();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non static methods and vars:
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sum();
		System.out.println(obj.name);
		
		// can I access static methods by using object reference? yes
		obj.add();  //warning will be given

	}
	
	public void sum() {
		System.out.println("Sum Method");
	}
	
	public static void add() {
		System.out.println("Add method");
		
	}

}
