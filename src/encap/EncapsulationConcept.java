package encap;

public class EncapsulationConcept {
	
	//Encapsulation is also called data hiding.
	//private data variables: Can't accessed directly from outside the class.
	
	private int empno;
	private String name;
	private int age;
	
	public static void main(String[] args) {
	
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setEmpno(12345);
		obj.setName("Vaishali");
		obj.setAge(25);
		
		System.out.println("Vaishali's Emp no:" +obj.getEmpno());
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
