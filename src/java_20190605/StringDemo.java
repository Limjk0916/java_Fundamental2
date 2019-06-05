package java_20190605;

public class StringDemo {
	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		String str3 = "java";
		String str4 = "java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		String ssn = "234567-1454545";
		//문자열 중에서 특정 index에 있는 문자를 반환한다.
		char c = ssn.charAt(6);
		System.out.println(c);
		//concat(String msg) 메서드는 문자열 연결
		String temp = ssn.concat("안녕하세요");
		System.out.println(temp);
		
		
		//endsWith(String temp)메서드는 temp 문자열로 끝나면 true, 그렇지 않으면 false
		String fileName = "test.zip";
		//endaWith은 맨마지막 문자가 zip인지 물어본다.
		if(fileName.endsWith("zip")){
			System.out.println("압축파일 입니다.");
			
		}else if(fileName.endsWith("doc")){
			System.out.println("Office 문서입니다");
		}else {
			System.out.println("파일입니다.");
		}
		
		
		//startsWith(String temp)메서드는 temp 문자열로 시작하면 true, 그렇지 않으면 false
		String url = "http://www.naver.com/";
		String uri = "sports/";
		if(uri.startsWith("sports")){
			System.out.println("스포츠 메뉴 입니다.");
		}else if(uri.startsWith("news")){
			System.out.println("뉴스 메뉴입니다.");
		}else {
			System.out.println("404 페이지 입니다.");
		}
		
		String s1 = "Java";
		String s2 = "JAVA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		s2 = s2.toLowerCase();
		System.out.println(s2);
		
		s1= s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(ssn.indexOf("-"));
		System.out.println(ssn.lastIndexOf("-"));
		
		ssn = ssn.replaceAll("-", "*");
		System.out.println(ssn);
		
		String html ="안녕하세요\n저는 임재경입니다.\n앞으로 잘부탁드립니다.";
		html = html.replaceAll("\n", "<br>");
		System.out.println(html);
		
		
		//234567*1454545
		//substring 0부터 6 전까지 가져오는 것 
		String ssn1 = ssn.substring(0,6);
		String ssn3 = ssn.substring(0, ssn.indexOf("*"));
		//substring 7부터 다 뽑아내라
		String ssn2 = ssn.substring(7);
		
		
		
		System.out.println(ssn1);
		System.out.println(ssn2);
		System.out.println(ssn3);
		
		
		fileName = "abc.efg.hij.zip";
		String fileName1 = fileName.substring(0, fileName.lastIndexOf("."));
		String fileName2 = fileName.substring(fileName.lastIndexOf(".")+1);
		
		System.out.println(fileName1);
		System.out.println(fileName2);
		
		fileName1 = "hello";
		fileName2 = "hello ";
		System.out.println(fileName1);
		System.out.println(fileName2);
		if(fileName1.equals(fileName2.trim())){
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		
		int a = 10;
		
		String t1 = String.valueOf(a);
		String t2 = a+"";
		System.out.println(t1);
		
		
		ssn = "234567-8923456";
		String[] t3 = ssn.split("-");
		System.out.println(t3[0]);
		System.out.println(t3[1]);
		
		String t4 = String.format("%,d and %,d", 10000, 200000,300000000);
		System.out.println(t4);
		
		
		String t5 = String.format("%,.2f and %,.2f", 10000.234, 200000.2356);
		System.out.println(t5);
		
		//실수형은 f, 정수형은 d, 문자열은 s
		//argument_index$ - 1$는 첫번째 인자 넣어주기, 2$ 두번째 인자넣어주기.....(순서를 바꿔서 인자를 넣어줄 때 용이)
		//flags - %,f는 콤마를 생기게 해줌
		//width - %,20f -> 20자리를 생기게 해줌, 맨 끝에서부터 채워나감
		//.precision - %,20.2f -> 소수점 2자리까지만
		String str = String.format("%1$,20.2f, %2$,20.2f, %3$,20.2f", 1111.11,2222.22,3333.33);
		System.out.println(str);
		
		int b1 = 10;
		int b2 = 20;
		System.out.printf("b1의 값은 %d 이고요, b2의 값은 %d 입니다.", b1, b2);
	
		
		
	}

}
