package inheri;

public class TestCar {

	public static void main(String[] args) {
		Swift sw = new Swift();
		sw.start();
		sw.stop();
		sw.petrol();
		sw.sitting();
		
		System.out.println("-------------------------------");
		Car ca = new Car();
		ca.start();
		ca.stop();
		ca.sitting();
	

	}

}
