package Encapsulation_Abstraction;



class Author{
	public static String name,email;
	public static char gender;
	Author(String n,String e,char g){
		name=n;
		email=e;
		gender=g;
	}
}

class Book{
	String book_name,author;
	double price;
	int qtystock;
	Book(String name){
		book_name=name;
	}
	public void getAuthor() {
		System.out.println("The name of the autor is"+Author.name);
		System.out.println("Email:"+Author.email);
		System.out.println("Gender:"+Author.gender);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtystock() {
		return qtystock;
	}
	public void setQtystock(int qtystock) {
		this.qtystock = qtystock;
	}
	public String getName() {
		return book_name;
	}
	
}
public class Program1 {
	public static void main(String args[]) {
		Book b=new Book("Java");
		@SuppressWarnings("unused")
		Author a=new Author("goselin",
				"goseling@gmmail.com",'m');
		b.setPrice(1000.0);
		b.setQtystock(20);
		System.out.println("The name of the book is"+b.getName());
		System.out.println("The price of the book is"+b.getPrice());
		System.out.println("The QtyStock of the book is"+b.getQtystock());
	}
}
