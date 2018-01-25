package homework7;

import java.util.ArrayList;

public class PercentageStrategy implements IPricingStrategy{

	private int discountPercentage ;
	private String name;
	private int bookType;
	private String type = "百分比优惠策略";
	private String id;
	@Override
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return item.getProdSpec().getPrice()*(this.discountPercentage)*0.01;
	}

	public PercentageStrategy(String id,String mName,int mBookType,int discount){
		setDiscountPercentage(discount);
		setName(mName);
		setBookType(mBookType);
		setId(id);
	}
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String bookTypeToString() {
		// TODO Auto-generated method stub
		return ""+bookType;
	}

	@Override
	public String profitToString() {
		// TODO Auto-generated method stub
		return ""+discountPercentage;
	}

	@Override
	public ArrayList<IPricingStrategy> getStrategies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSubTotal(double price) {
		// TODO Auto-generated method stub
		return discountPercentage*price;
	}

}
