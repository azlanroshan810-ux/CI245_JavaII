package chapter11;

public class Student extends Person{
	
	
	final int FRESHMAN = 1;
	final int SOPHOMORE = 2;
	final int JUNIOR = 3;
	final int SENIOR = 4;
	
	
	
	public int status;
	
	
	//method
	public Student(String new_name, String address, String phone, String email, int status){
		super(new_name, address, phone, email);
		this.status =status;
		System.out.println("Student Constructor");
	}
	
	public String toString(){
		return super.toString()+
				"\nClass : Student  "+
				"\nStudent Status  : " + status +
				"\n---------------------------------------------------------------";
	}
}
