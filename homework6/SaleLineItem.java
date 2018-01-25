package homework6;

public class SaleLineItem {
	private int copies;
	private ProductSpecification prodSpec;
	private IPricingStrategy strategy;
	
	public double getSubTotal(){		
		return strategy.getSubTotal(this)*copies;		
	}
	
	public SaleLineItem(int copy,ProductSpecification prodspec)
	{
		PricingStrategyFactory fac = new PricingStrategyFactory();
		copies=copy;
		prodSpec=prodspec;
		strategy=fac.getPricingStreategy(prodspec.getType());
	}
	
	public ProductSpecification getProdSpec(){
		return prodSpec;
	}
	
	
}
