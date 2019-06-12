package java_20190528;

public class Switch2Demo {
	public static void main(String[] args) {
		//arge[0]은 프로그램 실핼시 입력받은 값
		//Integer.parseInt() 메소드는 문자열을 int로 변환하는 기능.
		int month = 188;
		String season = null;
		switch (month){
		default:
			System.out.println(month+"월은 계절이 아닙니다.");break;
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";break;
		case 3:
		case 4:
		case 5:
			season = "봄";break;
		case 6:
		case 7:
		case 8:
			season = "여름";break;
		case 9:
		case 10:
		case 11:
			season = "가을";break;
	
	
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}

}
