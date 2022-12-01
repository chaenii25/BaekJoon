package chobo;

public class Book {
	private Address[] list;
	private int no;
	
	public Book(int a) {
		list = new Address[a];
		no=0;
	}
	
	public void show(int k) {
		list[k].show();
	}
	
	public void add(Address a) {
		list[no] = a;
		no++;
	}

	public void updatePhone(String a, String b) {
		for(int k=0;k<no;k++) {
			if(list[k].getName()==a) {
				list[k].setPhone(a);
				return;
			}
			else
				System.out.println("그런 이름의 친구가 없어요.");
		}
	}
}
