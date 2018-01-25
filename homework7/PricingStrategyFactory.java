package homework7;

import java.util.Vector;
import java.util.Map.Entry;

public class PricingStrategyFactory {
	
	private static PricingStrategyFactory instance=null;
	public StrategyCatalog catalog;
	public static PricingStrategyFactory getInstance()
	{
		if(instance==null)
		{
			instance=new PricingStrategyFactory();
		}
		return instance;
	}
	
	public IPricingStrategy getPricingStreategy(int bookType,double bookPrice){
		boolean isFind = false;
		IPricingStrategy returnStra = null;
		double price = 0;
		double temp = 0;
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
			if(entry.getValue().bookTypeToString().equals(""+bookType)){
				isFind = true;
				temp = MainUi.controller.strateCatalog.allStrategies.get(entry.getKey()).getSubTotal(bookPrice);
				System.out.println("temp"+temp);
				if(temp>price){
					returnStra = MainUi.controller.strateCatalog.allStrategies.get(entry.getKey());	
					price = temp;
				}
			}
		}
		if(isFind){
			return returnStra;
		}
		return new NoDiscountStratey();
	}
	
	public void setCatalog(StrategyCatalog mcatalog){
		catalog = mcatalog;
	}
	
	
}
