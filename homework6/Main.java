package homework6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sale cart=new Sale();
		SaleLineItem item1,item2,item3,item4,item5;
		PricingStrategyFactory factory=PricingStrategyFactory.getInstance();
		
		ArrayList<ProductSpecification> books=new ArrayList<>();
		ProductSpecification abook;
		abook=new ProductSpecification("1111","《UML与模式应用》",18,1);
		books.add(abook);
		abook=new ProductSpecification("2222","《Java与模式》",34,2);
		books.add(abook);
		abook=new ProductSpecification("3333","《HeadFirst 设计模式》",58,2);
		books.add(abook);
		abook=new ProductSpecification("4444","《爱丽丝历险记》",30,3);
		books.add(abook);
		abook=new ProductSpecification("5555","《煲汤大全》",20,4);
		books.add(abook);
		
						
		item1=new SaleLineItem(2, books.get(0));
		cart.additem(item1);
		
		item2=new SaleLineItem(2, books.get(1));
		cart.additem(item2);
		
		item3=new SaleLineItem(1, books.get(2));
		cart.additem(item3);
		
		item4=new SaleLineItem(3, books.get(3));
		cart.additem(item4);
		
		item5=new SaleLineItem(1, books.get(4));
		cart.additem(item5);
		
		double price=cart.getTotal();
		System.out.println("total price:"+price);
	}

}
