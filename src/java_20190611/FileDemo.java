package java_20190611;

import java.io.File;
import java.util.Calendar;

public class FileDemo {
	public boolean mkdirs(String path){
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if(!isExisted){
			isSuccess = f1.mkdirs();
			
		}
		return isSuccess;
	}
	
	public String getComma(int number){
		return String.format("%,d", number);
	}
	
	public String getComma(double number,int precision){
		return String.format("%,."+precision+"f", number);
	}
	public String getComma(long number){
		return String.format("%,d", number);
	}
	
	public boolean changeFile(String path){
		//path -> c:\down\2019\06\11\jdk.exe
		File f1 = new File(path);
		String fileName = f1.getName(); //jdk.exe
				
		String name = fileName.substring(0,fileName.lastIndexOf("."));//jdk
		String extension = fileName.substring(fileName.lastIndexOf("."));//exe
		name = String.valueOf(System.currentTimeMillis());//123123
		name = name+extension;//123123.zip
		
		
		String parent = f1.getParent();
		File f2 = new File(parent, name);
		return f1.renameTo(f2);
				
	}
	
	
	
	
	
	public static void main(String[] args) {
		//디렉토리 만들기
		FileDemo f = new FileDemo();
		f.mkdirs("c:\\down1\\2019");
		
		//파일의 크기 구하는 방법
		//파일의 크기는 long
		File f1 = new File("c:\\down", "Git-2.21.0-64-bit.exe");
		long fileSize = f1.length();
		//반올림 하는 메소드 Math.round
		//KB 1024로 나눠야 한다.
		String fileLength = f.getComma(Math.round((double)fileSize/(double)1024));
		System.out.println(fileLength+"KB");
		
		String fileName = f1.getName();
		String path = f1.getPath();
				
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf(".")+1);
		name = String.valueOf(System.currentTimeMillis());
		name = name+"."+extension;
		
		System.out.println(name);
		System.out.println(f1.getParent());
		String parent = f1.getParent();
		
		
		File f2 = new File("c:\\down", name);
		f1.renameTo(f2);
		
		//list로 탐색기를 만들 수가 있다.
		File f3 = new File("c:\\");
		String[] list = f3.list();
		for(String value : list){
			File f4 = new File(f3,value);
			if(f4.isDirectory()){
				System.out.println(value+"- 디렉토리");
			}else if(f4.isFile()){
				long size = f4.length();
				System.out.println(value+"- 파일("+size+")");
			}
			
		}
		
		
		// 파일 마지막 수정 날짜 
		File f5 = new File("c:\\down\\1560232374409.exe");
		
		long lastModified = f5.lastModified();
		
		
		
		//Calendar 추상클래스. 원래 추상클래스는 객체생성 못하는데, getInstance()은 자식을 통해서 객체 생성
		Calendar c = Calendar.getInstance();
		c.set(2019, 5, 10);
		//c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		//월은 0부터 가지고 오기 때문에 +1을 해줘야 한다.
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		System.out.print(year+"년"+month+"월"+day+"일");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek){
		case Calendar.MONDAY : System.out.println("월요일입니다.");break;
		case Calendar.TUESDAY : System.out.println("화요일입니다.");break;
		case Calendar.WEDNESDAY : System.out.println("수요일입니다.");break;
		case Calendar.THURSDAY : System.out.println("목요일입니다.");break;
		case Calendar.FRIDAY: System.out.println("금요일입니다.");break;
		case Calendar.SATURDAY : System.out.println("토요일입니다.");break;
		case Calendar.SUNDAY: System.out.println("일요일입니다.");break;
		
		}
		
		
		
		
		}
	}

