package java_20190530;

public class MainDemo {
	public static void main(String[] args) {
		// 1. Customer c 에서 Customer는 Reference Type, c는 Refernce
		// 3. new Customer는 Object
		/*Customer c = new Customer();
		c.name = "임재경";
		c.cphone = "010-2231-5346";
		//static 변수이기 때문에 모든 고객에 나옴
		Customer.interestRate = 4.3;
		// Customer.BANKNAME ="국민은행";
		
		c.register();
		
		Customer c2 =new Customer();
		c2.name = "강호동";
		c2.cphone = "101-01010-0010";
		Customer.interestRate = 4.5;
		
		c2.register();
		
		//c3 reference를  c2 reference가 가리키는 Object를 참조하라는 의미
		Customer c3 = c2;
		c2.name = "손정의";
		c2.cphone = "101-01010-0550";
		
		c3.register();
		c2.register();
		
		//reference 일때
		//c1==c2 -> false, 다른 object 참조
		//c2==c3 -> true, 같은 object 참조
*/
		Member m = new Member();
		m.setName("Lim");
		m.setCphone("101-020202-20202");
		m.setAdress("seoul");
		m.setZipcode("46780");
		
		System.out.println(m.getName());
		System.out.println(m.getAdress());
		System.out.println(m.getCphone());
		System.out.println(m.getZipcode());
		
		}

}
