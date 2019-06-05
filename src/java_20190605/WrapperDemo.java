package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.9";
		String s2 = "90.5";
		
		//primitive 데이터 타입을  Wrapper 클래스로 변환 int -> Integer
		
		Integer a1 = new Integer(a);
		Integer a2 = new Integer(b);
		
		//Wrapper 클래스 => primitive 데이타 타입 변환
		int a3 = a1.intValue() + a2.intValue();
		
		//int a3 = a1 +a2; (자동 형변환 해줌(intValue 생략), 자바 5.0부터 자동으로 해줌)
		
		
		//String -> primitive 데이타 타입 변환
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)Boxing : primitive type 을 Wrapper 클래스로 자동 변환
		
		Integer a4 = 10;
		Integer a5 = 20;
		
		//(auto)unBoxing : Wrapper 클래스를 primitive type으로 자동 변환
		
		int a6 = a4 +a5;
		
		System.out.println(a6);
		
	}

}
