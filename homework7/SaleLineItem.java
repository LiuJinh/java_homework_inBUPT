package homework7;

public class SaleLineItem {
	private int copies;
	private BookSpecification prodSpec;
	private IPricingStrategy strategy;
	
	public double getSubTotal(){
		return strategy.getSubTotal(this);		
	}
	
	public SaleLineItem(int copy,BookSpecification prodspec)
	{
		PricingStrategyFactory fac = new PricingStrategyFactory();
		copies=copy;
		prodSpec=prodspec;
		strategy=fac.getPricingStreategy(prodspec.getType(),prodSpec.getPrice());
	}
	
	public BookSpecification getProdSpec(){
		return prodSpec;
	}

	public double getCopies() {
		// TODO Auto-generated method stub
		return copies;
	}

}
