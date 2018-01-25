package homework6;

public class NoDiscountStratey implements IPricingStrategy{
	@Override
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return item.getProdSpec().getPrice();
	}

	public NoDiscountStratey(){}
}
