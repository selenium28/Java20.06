package inheri;

public class Swift extends Car{
	
	// Inheritance (IS-A relationship)
	// It is inheriting the properties of parent class into child class is known as Inheritance.
	
	//When same method is present in parent class as well as child class with the same name and 
	//same no. of arguments is called as Method-Overriding.
	
	public void start() {
		System.out.println("Swift--- Start");
	}
	
	public void petrol() {
		System.out.println("Swift--- Petrol");
	}

}
