package chapter11;

public class Staff extends Person {

	
	// Data field
	protected String title;
	
	public Staff(){
		System.out.println("Staff Defalut Constructor");
		}
	
	
	public Staff(String new_name, String address, String phone, String email, String title){
		super(new_name, address, phone, email);
		this.title =title;
		System.out.println("Student Constructor");
	}
	
	
	public String toString(){
		return super.toString() +
				"\nClass : Staff " +
				"\nStaff Title : " +title+
				"\n---------------------------------------------------------------";
	}
}
