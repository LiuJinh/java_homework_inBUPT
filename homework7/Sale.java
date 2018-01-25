package homework7;

import java.util.ArrayList;
import java.util.Iterator;

public class Sale implements Subject{
	public ArrayList<SaleLineItem> items = new ArrayList<SaleLineItem>();	;
	
	public Sale(){
		
	}
	public double getTotal(){
		double total = 0;
		Iterator<SaleLineItem> iter = items.iterator();
		while(iter.hasNext()){
			SaleLineItem temp = iter.next();
			total += (temp.getProdSpec().getPrice()-temp.getSubTotal())*(temp.getCopies());
		}		
		return total;
	}


	public void additem(SaleLineItem item1) {
		// TODO Auto-generated method stub
		items.add(item1);
	}
	@Override
	public void removeObserver(Observer obser) {
		// TODO Auto-generated method stub
		observers.remove(obser);
	}
	@Override
	public void registerObserver(Observer obser) {
		// TODO Auto-generated method stub
		observers.add(obser);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer obser:observers){
			obser.update(this);
		}
	}

	
}
