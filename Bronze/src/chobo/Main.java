package chobo;

public class Main {

	public static void main(String[] args) {
		Book book = new Book(10);
		
		Address a = new Address(1,"Kim","1234","Seoul",22);
		
		book.add(a);
		
		Address b= new Address(2,"Lee","2345","Suwon",21);
		book.add(b);
		
		Address c= new Address(3,"Park","3456","Cheonan",22);
		book.add(c);
		
		book.show(2);
		
		book.updatePhone("Kim", "2345");
	}

}
