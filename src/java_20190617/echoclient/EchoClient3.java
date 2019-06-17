package java_20190617.echoclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient3 {
	private int port;
	private String ip;
	private Socket socket;
	
	public EchoClient3(String ip, int port){
		this.ip = ip;
		this.port = port;
		
		try {
			socket = new Socket(ip, port);
			
			OutputStream out = socket.getOutputStream();
			
			InputStream in = socket.getInputStream();
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new EchoClient3("",3003);
	}

}
