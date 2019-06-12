package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fis= new FileInputStream("c:\\down\\1560232374409.exe");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\down\\2019\\1560232374409.exe");
			bos = new BufferedOutputStream(fos);
			
			//PrintStream�� �������� ����
			ps = new PrintStream(bos,true);//true => autoFlush
					
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while((readByteCount = bis.read(readBytes)) != -1){
				ps.write(readBytes,0,readByteCount);
			}
			
			//PrintStream�� �������� �����
			PrintStream ps1 =System.out;
			ps1.println(1);
			ps1.println("aaa");
			ps1.println(42.5);

			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();				
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
