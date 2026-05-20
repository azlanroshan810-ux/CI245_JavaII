package chapter9;

public class HW3_testStock {

	public static void main(String[] args) {
		System.out.println("HW3 Question 1 \nBY: Azlan Roshan\n\n\n");
	// Create a stock object
		Stock yourStock = new Stock("ORCL", "Oracle Corporation");
		yourStock.setPreviousClosingPrice(34.5);
		yourStock.setCurrentPrice(31.35);
		
		System.out.println(yourStock);
		





// Create a stock object
	Stock myStock = new Stock("AAPL", "Apple Inc.");
	myStock.setPreviousClosingPrice(299);
	myStock.setCurrentPrice(302);
	
	System.out.println(myStock);
	
	}
}