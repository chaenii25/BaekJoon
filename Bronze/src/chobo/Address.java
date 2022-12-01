package chobo;

public class Address {
	private int id,age;
	private String name, phone, res;

	public Address() {
		// 객체지향의 3가지 원리 : 캡슐화, 상속, 다형성
	}
	
	public Address(int a, String b, String c, String d, int e) {
		id = a;name=b; phone =c; res = d; age =e;
	}
	
	public void show() {
		System.out.println("["+id+"]:"+name+" "+phone+" "+res+" "+age);
	}
	
	public String getName() {return name;}
	
	public String getPhone() {return phone;}
	
	public void setPhone(String a) {phone=a;}
	
	public void setName(String a) {name =a;}
	
}
