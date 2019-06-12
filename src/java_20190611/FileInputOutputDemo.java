package java_20190611;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			//FileInputStream의 c:\\down\\jdk.exe 경로에 파일이 없으면 
			//FileNotFoundException 예외를 발생시킨다.
			fin = new FileInputStream("C:\\down\\1560232374409.exe");
			//FileOutputStream은 C:\\down\\2019\\06\\11\\jdk.exe 
			//위의 경로와 디렉토리가 없으면 디렉토리 및 파일을 생성해준다.
			
			fos = new FileOutputStream("C:\\down\\2019\\1560232374409.exe");
			
			/*int readByte = 0;
			while((readByte = fin.read()) != -1){
					fos.write(readByte);*/
					
				//}
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			while((readByteCount= fin.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
			}
			

		    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			    e.printStackTrace();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
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


