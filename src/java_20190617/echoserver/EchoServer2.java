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

public class EchoServer2 {
	private int port;
	private ServerSocket serverSocket;
	
	public EchoServer2 (int port){
		this.port = port;

		try {
			//1. Create
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(true){
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			
			try{
			//2. accept	
			Socket socket = serverSocket.accept();
			
			// 4,5. 서버와 TCP 커넥션이 만들어지면서 클라이언트와 통신할 수 있는
			// Socket 객체가 생성된다.
			// 7.클라이언트와 통신할 수 있는 Socket을 생성
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			System.out.println(ip+"접속했습니다.");
			
			//9. in/outstream socket create
			InputStream in = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			OutputStream out = socket.getOutputStream();
			
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(readLine);
			bw.newLine();
			bw.flush();
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		new EchoServer2(3002);
	}

}
