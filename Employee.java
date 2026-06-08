package chapter11;

public class Employee extends Person {

	
	
	// Data field
	
	protected double salary;
	protected String office;
	protected java.util.Date dateHired;
	
	
	public Employee(){
		System.out.println("employee Defalut Constructor");
	}
	
	//Method
	public Employee(String new_name, String address, String phone, String email, double salary, String office ){
		super(new_name, address, phone, email);
		this.salary = salary;
		this.office = office;
		dateHired = new java.util.Date(); 
		System.out.println("Employee Constructor");
	}
	
	
	
	public String toString(){
		return super.toString() +
				"\nClass : Employee " +
				"\nEmployee Salary : " +salary+
				"\n---------------------------------------------------------------";
	}
}
