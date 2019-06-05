package java_20190605;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String s1 = "42.9";
		String s2 = "90.5";
		
		//primitive ������ Ÿ����  Wrapper Ŭ������ ��ȯ int -> Integer
		
		Integer a1 = new Integer(a);
		Integer a2 = new Integer(b);
		
		//Wrapper Ŭ���� => primitive ����Ÿ Ÿ�� ��ȯ
		int a3 = a1.intValue() + a2.intValue();
		
		//int a3 = a1 +a2; (�ڵ� ����ȯ ����(intValue ����), �ڹ� 5.0���� �ڵ����� ����)
		
		
		//String -> primitive ����Ÿ Ÿ�� ��ȯ
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		double d3 = d1 + d2;
		
		System.out.println(a3);
		System.out.println(d3);
		
		//(auto)Boxing : primitive type �� Wrapper Ŭ������ �ڵ� ��ȯ
		
		Integer a4 = 10;
		Integer a5 = 20;
		
		//(auto)unBoxing : Wrapper Ŭ������ primitive type���� �ڵ� ��ȯ
		
		int a6 = a4 +a5;
		
		System.out.println(a6);
		
	}

}
