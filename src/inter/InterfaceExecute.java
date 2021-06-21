package inter;

public class InterfaceExecute implements InterfaceFirst,InterfaceSecond{

	@Override
	public void car() {
		System.out.println("Car Method");
		
	}

	@Override
	public void bike() {
		System.out.println("Bike Method");
		
	}
	

	public static void main(String[] args) {
		InterfaceExecute obj = new InterfaceExecute();
	//	InterfaceExecute() - Constructor
		obj.bike();
		obj.car();
	}


}
