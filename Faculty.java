package chapter11;


public class Faculty extends Person {

	// Data field
	
	protected String rank;
	protected String officeHours;
	
	public Faculty(){
		System.out.println("Faculty Defalut Constructor");
		}
	
	public Faculty(String new_name, String address, String phone, String email, String rank,String officeHours){
		super(new_name, address, phone, email);
		this.rank =rank;
		this.officeHours= officeHours;
		System.out.println("Student Constructor");
	}
	
	public String toString(){
		return super.toString()+
				"\nClass : faculty  "+
				"\nRank  : " + rank +
				"\nOfficeHours :" + officeHours+
				"\n---------------------------------------------------------------";
	}
}