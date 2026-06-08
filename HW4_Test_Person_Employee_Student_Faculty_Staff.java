package chapter11;

public class HW4_Test_Person_Employee_Student_Faculty_Staff {

	public static void main(String[] args) {
		System.out.println("Homework 4 by Azlan Roshan, 6/8/2026");
		//Create and display a person
		Person p1 = new Person();
		Person p2 = new Person("Smith", "813 Broadway", "312-999-1000", "Smith@eastwest,edu");
		System.out.println(p1);
		
		System.out.println(p2);
	
		System.out.println("-----Create and Display Employee----------");
		Employee e = new Employee("Jane" ,"813 Broadway", "312-999-1000", "Smith@eastwest,edu", 89000, "999 N Michigan");
		System.out.println(e);
	
		System.out.println("\n-----Create and Display Student----------");
		
		Student S2 = new Student("Smith", "813 Broadway", "312-999-1000", "Smith@eastwest,edu", 3);
		System.out.println(S2);
		
		Staff ST1 = new Staff(); 
		Staff ST2 =  new Staff("Smith", "813 Broadway", "312-999-1000", "Smith@eastwest,edu", "President");
		
		System.out.println(ST1);
		System.out.println("\n");
		System.out.println(ST2);
				
		Faculty F1 = new Faculty("Smith", "813 Broadway", "312-999-1000", "Smith@eastwest,edu", "Rank", "09:00 - 17:00");
		System.out.println(F1);
		
		
	}	
}
