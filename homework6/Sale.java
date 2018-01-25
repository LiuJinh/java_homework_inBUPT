package homework6;

import java.util.ArrayList;
import java.util.Iterator;

public class Sale {
	private ArrayList<SaleLineItem> items;
	
	public Sale(){
		items = new ArrayList<SaleLineItem>();		
	}
	public double getTotal(){
		double total = 0;
		Iterator<SaleLineItem> iter = items.iterator();
		while(iter.hasNext()){
			SaleLineItem temp = iter.next();
			total += temp.getSubTotal();
		}		
		return total;
	}

	public ArrayList<SaleLineItem> getItems() {
		return this.items;
	}

	public void setItems(ArrayList<SaleLineItem> items) {
		this.items = items;
	}

	public void additem(SaleLineItem item1) {
		// TODO Auto-generated method stub
		items.add(item1);
	}

	
}
