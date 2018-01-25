package homework7;

import java.util.ArrayList;

public class CopositeStrategy implements IPricingStrategy{

	public ArrayList<IPricingStrategy> strategies;
	private String name;
	private int bookType;
	private String type = "组合策略";
	private String id;
	
	CompositeBestForCustomer cb;
	
	public void add(IPricingStrategy strategy){
		strategies.add(strategy);
	}
	
	
	public CopositeStrategy(String id,String mName,int mBookType,ArrayList<IPricingStrategy> mStrategies2){		
		strategies = new ArrayList<IPricingStrategy>(mStrategies2);	
		setName(mName);
		setBookType(mBookType);
		setId(id);
	}

	public double getSubTotal(SaleLineItem item){
		cb = new CompositeBestForCustomer();
		return cb.getSubTotal(item, strategies);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBookType() {
		return bookType;
	}


	public void setBookType(int bookType) {
		this.bookType = bookType;
	}

	public String getType() {
		return type;
	}

	@Override
	public String bookTypeToString() {
		// TODO Auto-generated method stub
		return ""+this.bookType;
	}

	@Override
	public String profitToString() {
		// TODO Auto-generated method stub
		String temp = "";
		System.out.println(strategies.size());
		for(int i = 0;i<strategies.size();i++){
			temp+=strategies.get(i).getId()+",";
		}
		return temp+"组成";
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Override
	public ArrayList<IPricingStrategy> getStrategies() {
		// TODO Auto-generated method stub
		return strategies;
	}


	@Override
	public double getSubTotal(double price) {
		// TODO Auto-generated method stub
		double subTotal = 0;
		for(int i = 0;i<strategies.size();i++){
			if(strategies.get(i).getSubTotal(price)>subTotal)
				subTotal = strategies.get(i).getSubTotal(price);
		}
		return subTotal;
	}
}
