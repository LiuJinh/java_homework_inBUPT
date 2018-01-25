package homework6;

public class PercentageStrategy implements IPricingStrategy{

	private double discountPercentage = 0.07;
	@Override
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return item.getProdSpec().getPrice()*(1-this.discountPercentage);
	}

	public PercentageStrategy(double discount){
		setDiscountPercentage(discount);
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}
