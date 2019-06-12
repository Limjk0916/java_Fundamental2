package java_20190612;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("c:\\down\\2019\\HelloWorld.java");
			bw = new BufferedWriter(fw);
			String readLine = null;
			while((readLine = br.readLine()) != null){
				//br.readLine()�� ������ �������� ���� ������ ��ȯ�Ѵ�.
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(bw != null) bw.close();				
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
		}
	}

}
}
