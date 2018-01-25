package homework7;

import java.util.ArrayList;

interface IPricingStrategy {
	public double getSubTotal(SaleLineItem item);
	public double getSubTotal(double price);
	public String getName();
	public String getType();
	public String bookTypeToString();
	public String profitToString();
	public String getId();
	public ArrayList<IPricingStrategy> getStrategies();
}
