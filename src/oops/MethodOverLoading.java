package oops;

public class MethodOverLoading {

	public static void main() {
//		MethodOverLoading obj = new MethodOverLoading();
//		obj.sum();
//		obj.sum(10);
//		obj.sum(10, 20);
	}
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	public static void main(int a) {

	}
	//you can not create a method inside a method
	//duplicate methods: same method name with same no of arguments are not allowed
	//method overloadig: When the method name is same with different parameters within the same class
	//is called as method overloadig.
	public void sum() {  // 0 parameter
		System.out.println("SUM method -- 0 input parameter");

	}

	public void sum(int i) { // 1 parameter
		System.out.println("SUM method -- 1 input parameter");
	}

	public void sum(int m, int n) { // 2 parameter
		System.out.println("SUM method -- 2 input parameter");
	}

}
