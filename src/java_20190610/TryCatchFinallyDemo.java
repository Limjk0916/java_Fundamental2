package java_20190610;

public class TryCatchFinallyDemo {
	public static double average(int a,int b){
		int sum = a + b;
		return (double)sum / (double)2;
	}
	
	public static void main(String[] args) {
		//if(args.length != 2){
		//	System.err.println("usage : javaTryCatchFinallyDemo" + "[국어점수] [영어점수]");
			
		//	return;
		
		//Integer.parseInt() 메서드는 숫자가 아닌 문자열일 경우 즉, 일반 문자열일 경우
		//NumberFormatException 예외가 발생함
		
		try {
			//ArrayIndexOutOfBoundsException
			int korea = Integer.parseInt(args[0]);
			//JVM은 실행을 중지시키고, 예외 객체인 NumberFormatException 객체를 생성한 후 catch 블럭을 찾는다.
			int english = Integer.parseInt(args[1]);
			double avg = average(korea, english);
			System.out.printf("평균 : %.2f",avg);
		} catch (NumberFormatException e){
			//jvm 메세지와 동일하게 출력 됨
			//e.printStackTrace();
			//System.err.println("예외 메시지 : "+e.getMessage());
			System.err.println("문자말고 숫자를 입력하셔야 합니다.");
		} catch (ArrayIndexOutOfBoundsException e){
			//jvm 메세지와 동일하게 출력 됨
			//e.printStackTrace();
			//System.err.println("예외 메시지 : "+e.getMessage());
			System.err.println("usage : javaTryCatchFinallyDemo" + "[국어점수] [영어점수]");
		} finally {
			System.out.println("finally block");
		}
		
	}

}
