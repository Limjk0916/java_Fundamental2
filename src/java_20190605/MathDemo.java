package java_20190605;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.5);
		
		System.out.println(d1);
		
		double d2 = Math.floor(12.45);
		System.out.println(d2);
		
		
		//소수점 이하는 다 반올림
		long d3 = Math.round(42.5);
		System.out.println(d3);
		
		double d4 = Math.abs(-4245.56);
		System.out.println(d4);
		
		double d5 = Math.max(4.5, 6.7);
		double d6 = Math.min(34.7, 56.8);
		System.out.println(d5);
		System.out.println(d6);
		
		double d7 = Math.sqrt(4);
		double d8 = Math.pow(2, 3);
		double d9 = Math.random();
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		
		
		
		
	}

}
