package homework7;

import java.util.ArrayList;

public class BookCatalog {
	public ArrayList<BookSpecification> allBooks = new ArrayList<BookSpecification>();
	
	public BookSpecification getBookSpecification(String isbn){
		BookSpecification needBook = null;
		for(int i = 0;i<allBooks.size();i++){
    		if(allBooks.get(i).getIsbn().equals(isbn))
    		{
    			needBook = allBooks.get(i);
    			break;
    		}
    	}
		return needBook;
	}
}
