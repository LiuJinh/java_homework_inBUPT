package homework6;

public class ProductSpecification {
	private String isbn;
	private double price;
	private String title;
	private int type;
	
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double mprice){
		this.price = mprice;
	}

	public int getType() {
		return type;
	}

	public void setType(int mtype) {
		this.type = mtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String mtitle) {
		this.title = mtitle;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String misbn) {
		this.isbn = misbn;
	}
	
	public ProductSpecification(String isbn,String name,double price,int type)
	{
		this.isbn=isbn;
		this.title=name;
		this.price=price;
		this.type=type;
	}
}
