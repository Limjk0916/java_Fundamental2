package java_20190530;

public class Member {
	//setname은 instance 변수를 변경하고, getname은 instance 변수를 가져온다.
	private String name;
	private String cphone;
	private String address;
	private String zipcode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public static void main(String[] args) {
		int x = 10; 
		int y = 20;
		int tmp = 0;
		
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
		
		
	}
	
		
	}

