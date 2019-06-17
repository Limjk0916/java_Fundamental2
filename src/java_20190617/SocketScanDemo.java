package java_20190617;

import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class SocketScanDemo extends Thread{
	public void run() {
		Socket s = null;
		
		for(int i=20;i<200;i++){
		try {
			//Socket 객체가 생성되었다는 얘기는 host, port로 통신할 수 있기때문에
			//해당 host, port응 사용중이라는 얘기.
			s = new Socket("127.0.0.1",i);		
			System.out.println(i + "번호를 사용중 입니다.");
		} catch (UnknownHostException e) {
			System.out.println("해당 호스트가 잘못되었습니다.");
		} catch (IOException e){
			System.out.println(i + "번호를 사용하고 있지 않습니다. ");
		}
				
	}
	}
	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();
	}


	}

	
	


