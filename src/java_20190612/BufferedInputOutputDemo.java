package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("c:\\down\\1560232374409.exe");
			//Stream Chaining
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c:\\down\\2019\\1560232374409.exe");
			//Stream Chaining
			bos = new BufferedOutputStream(fos);
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while((readByteCount = bis.read(readBytes)) != -1){
				bos.write(readBytes,0,readByteCount);
			}
			//���۰����� �� ������ �ʴ��� ���� ������ ����ִ� ����
			bos.flush();
			
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
