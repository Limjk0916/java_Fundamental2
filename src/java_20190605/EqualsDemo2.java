package java_20190605;

public class EqualsDemo2 {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		//문자열을 대소문자 구분하지 않고 비교하고 싶으면 equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
