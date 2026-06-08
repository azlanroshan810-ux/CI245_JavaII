package chapter11;

public class Person {

	// data
	protected String address;
	protected String name;
	protected String phone;
	protected String email;
	
	public Person(){
		System.out.println("Perosn Defalut Constructor");
	}
	// method
	public Person(String newName, String phone, String address, String email){
		name = newName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		System.out.println("person Constructor");
		
	}
	
	
	//setAddrss(String): void
	public void setAddrss(String newValue){
		address = newValue;
	}
	
	//toString()
	public String toString(){
		return "Class : Person and name is : " + name +
				"\nAddress	: " + address+
				"\nPhone	: " + phone +
				"\nEmail	: " + email+
				"\n-----------------------";
	}
	
}
