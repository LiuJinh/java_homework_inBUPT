package homework7;

import java.util.ArrayList;

public class FlatRateStrategy implements IPricingStrategy{

	private double discountPerBook;
	private String name;
	private int bookType;
	private String type = "绝对值优惠策略";
	private String id ;
	@Override 
	
	
	public double getSubTotal(SaleLineItem item) {
		// TODO Auto-generated method stub
		return discountPerBook;
	}
	
	
	public FlatRateStrategy(String id,String name2, int bookType2, double profit) {
		// TODO Auto-generated constructor stub
		discountPerBook = profit;
		name = name2;
		bookType = bookType2;
		setId(id);
	}

	public double getDiscount(){
		return this.discountPerBook;
	}

	public void setDiscount(double discount){
		this.discountPerBook = discount;
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
		return ""+discountPerBook;
	}


	@Override
	public ArrayList<IPricingStrategy> getStrategies() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public double getSubTotal(double price) {
		// TODO Auto-generated method stub
		return discountPerBook;
	}

}
