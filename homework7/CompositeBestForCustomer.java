package homework7;

import java.util.ArrayList;

public class CompositeBestForCustomer {
	public double getSubTotal(SaleLineItem item,ArrayList<IPricingStrategy> strategies){
		double subTotal = 0;
		for(int i = 0;i<strategies.size();i++){
			if(strategies.get(i).getSubTotal(item)>subTotal)
				subTotal = strategies.get(i).getSubTotal(item);
		}
		return subTotal;
	}
}
