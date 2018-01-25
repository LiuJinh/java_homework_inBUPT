package homework7;


import java.util.ArrayList;
import java.util.Vector;
import java.util.Map.Entry;


public class Controller {
	public StrategyCatalog strateCatalog = new StrategyCatalog();
	public BookCatalog bookCatalog = new BookCatalog();
	public Sale sale = new Sale();
	
	public void addCompositeStrategy(String id,String name,String kind,int bookType,ArrayList<IPricingStrategy> strategies){
		CopositeStrategy newStrategy2 = new CopositeStrategy(id,name,bookType,strategies);
		System.out.println(newStrategy2.profitToString());
		System.out.println("test");
		strateCatalog.allStrategies.put(id, newStrategy2);
	}
	
	void addSimpleStrategy(String id,String name,String kind,int bookType,double profit){
		FlatRateStrategy newStrategy = new FlatRateStrategy(id,name,bookType,profit);
		strateCatalog.allStrategies.put(id, newStrategy);
	}
	
	void addSimpleStrategy(String id,String name,String kind,int bookType,int profit){
		PercentageStrategy newStrategy1 = new PercentageStrategy(id,name,bookType,profit);
		strateCatalog.allStrategies.put(id, newStrategy1);		
	}
	
	public boolean deleteStrategy(String mId){
		boolean isExist=false;
		strateCatalog.allStrategies.remove(mId);
		for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
			if(entry.getValue().getType().equals("组合策略")){
				for(int i = 0;i<entry.getValue().getStrategies().size();i++){
					if(entry.getValue().getStrategies().get(i).getId().equals(mId)){
						MainUi.controller.strateCatalog.allStrategies.remove(entry.getKey());
						isExist = true;
						break;
					}						
				}
			}
		}
		return isExist;
	}
	
	void updateStrategy(String id,IPricingStrategy strategy){
		strateCatalog.allStrategies.put(id, strategy);
		if(!MainUi.controller.strateCatalog.allStrategies.get(id).getType().equals("组合策略")){
			for(Entry<String,IPricingStrategy> entry:MainUi.controller.strateCatalog.allStrategies.entrySet()){		 
				if(entry.getValue().getType().equals("组合策略")){
					for(int i = 0;i<entry.getValue().getStrategies().size();i++){
						if(entry.getValue().getStrategies().get(i).getId().equals(id)){
							ArrayList<IPricingStrategy> allStrategy = new ArrayList<IPricingStrategy>(entry.getValue().getStrategies());
							allStrategy.remove(i);
							allStrategy.add(strategy);
							CopositeStrategy newOne = new CopositeStrategy(strategy.getId(),strategy.getName(),Integer.parseInt(strategy.bookTypeToString()),allStrategy);
							entry.setValue(newOne);
							System.out.println("true"+i);
							break;
						}						
					}
				}
			}
		}
	}
	
	public void buyBook(String isbn,int number){
		BookSpecification book = bookCatalog.getBookSpecification(isbn);
		SaleLineItem newSale = new SaleLineItem(number,book);
		sale.items.add(newSale);
		sale.notifyObservers();
	}
	
	public Sale getSale(){
		return null;
	}

	public void addBook(String bookIsbn, String bookName, double bookPrice, int bookType) {
		// TODO Auto-generated method stub
		BookSpecification newBook = new BookSpecification(bookIsbn,bookName,bookPrice,bookType);
		bookCatalog.allBooks.add(newBook);	
	}
	
	
}
