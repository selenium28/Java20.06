package basicJava;

public class GlobalAndLocalVariables {
	
	//Global vars -- Class variables
	String name = "Dev";
	int age = 25;

	public static void main(String[] args) {
		int i = 10; // local var for main method
		System.out.println(i);
		GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void add() {
		int i = 20; // local variable for add method
		int j = 15;
	}

}
