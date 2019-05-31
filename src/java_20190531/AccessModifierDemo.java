package java_20190531;

import java_20190531tt.Cat;

public class AccessModifierDemo extends Cat{
	public static void main(String[] args) {
		Car c = new Car();
		//private는 같은 클래스에서만 접근이 가능
		//c.modelNumber ="68오4472";
		
		//default는 같은 패키지(디렉토리)에서 접근가능
		c.color = "red";
		
		//서로 다른 패키지에서 상속받은 경우 접근가능
		c.doorCount =5;
		
		//서로 다른 패키지에서 접근 가능
		c.price = 10_000_000;
		
		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);
		
		
		Cat cat = new Cat();
		cat.nicName = "tomcat";
		
		System.out.println(cat.nicName);
		
		AccessModifierDemo a = new AccessModifierDemo();
		//Cat 클래스를 상속 받으려면 protected도 접근 가능.
		a.age = 10;
		a.nicName = "먼지";
		
		
	}

}
