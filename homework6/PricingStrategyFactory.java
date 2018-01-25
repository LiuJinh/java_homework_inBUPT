package homework6;

public class PricingStrategyFactory {
	
	private static PricingStrategyFactory instance=null;
	
	public static PricingStrategyFactory getInstance()
	{
		if(instance==null)
		{
			instance=new PricingStrategyFactory();
		}
		return instance;
	}
	
	public IPricingStrategy getPricingStreategy(int bookType){
		switch(bookType)
		{
		case 1:     //教材类
			return new FlatRateStrategy(1);
		case 2:     //非教材类
			return new PercentageStrategy(0.03);
		case 3:     //连环画
			return new PercentageStrategy(0.07);
		case 4:     //其他类
			return new NoDiscountStratey();
		default:
			return new NoDiscountStratey();	
		}
	}
}
