package java_20190617.echoserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer3 {
	private int port;
	private ServerSocket serverSocket;
	
	public EchoServer3(int port){
		this.port = port;
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true){
			System.out.println("클라이언트의 접속을 대기하고있습니다.");
			
			try {
				Socket socket = serverSocket.accept();
				
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println(ip+"가 접속하였습니다.");
				
				InputStream in = socket.getInputStream();
				
				
				OutputStream out = socket.getOutputStream();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new EchoServer3(3003);
	}

}
