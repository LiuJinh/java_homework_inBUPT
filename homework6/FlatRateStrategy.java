package homework6;

public class FlatRateStrategy implements IPricingStrategy{

	private double discountPerBook = 3;
	@Override 
	
	
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return item.getProdSpec().getPrice()-discountPerBook;
	}
	
	public FlatRateStrategy(double discount){
		discountPerBook = discount;
	}
	
	public double getDiscount(){
		return this.discountPerBook;
	}

	public void setDiscount(double discount){
		this.discountPerBook = discount;
	}
}
