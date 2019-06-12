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
			//FileInputStream�� c:\\down\\jdk.exe ��ο� ������ ������ 
			//FileNotFoundException ���ܸ� �߻���Ų��.
			fin = new FileInputStream("C:\\down\\1560232374409.exe");
			//FileOutputStream�� C:\\down\\2019\\06\\11\\jdk.exe 
			//���� ��ο� ���丮�� ������ ���丮 �� ������ �������ش�.
			
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


