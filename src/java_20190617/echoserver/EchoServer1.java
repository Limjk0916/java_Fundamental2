package java_20190617.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer1 {
	private int port;
	private ServerSocket serverSocket;

	public EchoServer1 (int port){
		
		this.port = port;
		
		try {
			// 1. ServerSocket 객체를 생성한다
			serverSocket = new ServerSocket(port);
		 } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
		while (true) {
			System.out.println("클라이언트 접속을 대기하고있습니다.");
			
			try {
				  // 2. ServerSocket의 accept() 메서드를 클라이언트 접속을 대기한다
				Socket socket = serverSocket.accept();
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println(ip+"접속했습니다.");
				
				 // 4.5 서버와 TCP 커넥션이 만들어지면서 클라이언트와 통신할 수 있는 Socket 객체가 생성된다.

				 // 7. 클라이언트부터 메세지를 받는다.
				InputStream in = socket.getInputStream();
				
                // 7-1 
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
				
				
				 // 8. 받은 메세지를 클라이언트에게 다시 보낸다.
				OutputStream out = socket.getOutputStream();
				
				// 8-1
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				// newLine은 개행을 도와준다.
				bw.newLine();
				// buffer에 안차면 보내주지 않기 때문에 flush를 써줘야한다.
				bw.flush();
				
				
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

	public static void main(String[] args) {
		new EchoServer1(3001);
	}

}
