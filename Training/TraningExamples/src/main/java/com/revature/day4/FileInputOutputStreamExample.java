package com.revature.day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamExample {
			
	static int i;
	static FileInputStream fis = null;
	static FileOutputStream fos = null;
	public static void main(String[] args) throws Exception {
		readBytes();
		writeBytes();
	}
	
	static void readBytes() {
		try {
			fis = new FileInputStream("src\\main\\resources\\DummyData.txt");
			
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	static void writeBytes() throws Exception {
			fos = new FileOutputStream("src\\main\resources\\outputFile.txt");
			fos.write(i);
			fos.close();
			
	}
}
