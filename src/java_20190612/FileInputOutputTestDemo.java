package java_20190612;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputOutputTestDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			fin = new FileInputStream("");
			fos = new FileOutputStream("");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			while((readByteCount = fin.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
			}
				
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(fin != null) fin.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
