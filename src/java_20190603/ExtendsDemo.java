package java_20190603;

public class ExtendsDemo {
	
	public static void main(String[] args) {
		
		
		Customer c = new Customer();
		c.name = "임재경";
		c.cphone = "010-2231-5346";
		System.out.println("이름 : "+c.name);
		System.out.println("핸드폰 : "+c.cphone);
		c.actionCustomer();
		
		Alba a = new Alba();
		a.name = "알바생";
		a.cphone = "010-56565-5665";
		a.address = "서울";
		System.out.println("이름 : "+a.name);
		System.out.println("핸드폰 : "+a.cphone);
		System.out.println("주소 : "+a.address);
		a.actionAlba();
		a.actionCustomer();

		
		//상속 관계에 있는 type은 바꿀 수 있다. (부모 클래스로) ex) Manager -> Alba
		Manager m = new Manager();
		m.name = "매니저";
		m.cphone = "010-8989-898";
		m.address = "경기도";
		m.id = "slslsle";
		m.password = "123123";
		System.out.println("이름 : "+m.name);
		System.out.println("핸드폰 : "+m.cphone);
		System.out.println("주소 : "+m.address);
		System.out.println("아이디 : "+m.id);
		System.out.println("비밀번호 : "+m.password);
		m.actionCustomer();
		m.actionManager();
		m.actionAlba();
		
		//Super 타입(Alba)으로 Sub의 객체(new manager)를 생성할 수 있다.
		//멤버 변수는 Super 타입(Alba)의 포함한 상위 클래스(Customer) 접근 가능.
		//속성은 Alba a = new Alba();와 같다.
		//actionManager은 불러낼 수 없다. 매체가 alba이기 때문에
		Alba alba = new Manager();
		alba.name = "매니저";
		alba.cphone = "010-8989-898";
		alba.address = "경기도";
		//alba.id = "slslsle";
		//alba.password = "123123";
		System.out.println("이름 : "+m.name);
		System.out.println("핸드폰 : "+m.cphone);
		System.out.println("주소 : "+m.address);
		System.out.println("아이디 : "+m.id);
		System.out.println("비밀번호 : "+m.password);
		alba.actionAlba();
		alba.actionCustomer();
		
		
		
	}

}
