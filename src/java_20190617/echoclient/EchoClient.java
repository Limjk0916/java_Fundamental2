package java_20190617.echoclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip ;
	private int port;
	private Socket socket;
	
	public EchoClient(String ip,int port){
		this.ip = ip;
		this.port = port;
		
		try {
			//3,4.Socket 객체를 생성한다.
			socket = new Socket(ip, port);
			//7. 서버와 통신할 수 있는 socket 객체 생성
			
			//8.서버와 통신할 수 있는 in,out 스트림 생성
			//서버에게 메세지를 보낸다
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("메롱");
			//newLine은 개행을 도와준다.
			bw.newLine();
			//buffer에 안차면 보내주지 않기 때문에 flush를 써줘야한다.
			bw.flush();
			
			//서버로부터 메세지를 받는다.
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = br.readLine();
			System.out.println(readLine);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EchoClient("192.168.0.151",3000);
	}

}
