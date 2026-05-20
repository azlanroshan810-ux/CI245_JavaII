package chapter9;

public class Stock {

	
	//data fields
	private String symbol;
	private String name;
	private Double previousClosingPrice;
	private Double currentPrice;
	
	
	//Method
	public Stock (String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;	
	}
	//--------------------------------------------------------
	// Accessor methods
	//--------------------------------------------------------
	// GetSymbol ( ): String
	public String getSymbol(){
		return symbol;
	}
	
	// + getName( ): double
	public String getName(){
		return name;
	}
	
	
	// + getPreviosClosingPrice ( ): double
	public Double getPreviosClosingPrice(){
		return previousClosingPrice;
	}
	
	// + GetCurrentPrice ( ): double
	
	public Double getCurrentPrice(){
		return currentPrice;
	}
	
	//--------------------------------------------------------
	//mutator method
	//--------------------------------------------------------
	// + setPreviousClosingPrice (newprice : Double) : void
	public void setPreviousClosingPrice (double newPrice){
		previousClosingPrice = newPrice;
	}
	
	// + setCurrentPrice (newprice : Double) : void
	public void setCurrentPrice (double newPrice){
		currentPrice = newPrice;
	}
	
	
	//-------------------------------------------------------
	// Regular Method
	//--------------------------------------------------------
	// + getChangePercent() : double
	public double getChangePercent(){
		return((currentPrice - previousClosingPrice) / previousClosingPrice);
	}
	
	
	// + roString() : String
	public String toString(){
		return "The object: " + 
				"\nCompanyName :	  " + name +
				"\nStock Symbol:	  " + symbol +
				"\nCurrent Price:	$ " + currentPrice +
				"\nPercentage Change: " + ((int)(getChangePercent()*10000))/100.0+ "%" ;
	}
	
	
	
	
	
	
	
}
