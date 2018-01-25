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
		case 1:     //�̲���
			return new FlatRateStrategy(1);
		case 2:     //�ǽ̲���
			return new PercentageStrategy(0.03);
		case 3:     //������
			return new PercentageStrategy(0.07);
		case 4:     //������
			return new NoDiscountStratey();
		default:
			return new NoDiscountStratey();	
		}
	}
}
