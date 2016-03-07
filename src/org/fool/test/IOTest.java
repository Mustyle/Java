package org.fool.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/CalInstall.log")));
			
			String str = null;
			
			while (null != (str = br.readLine())) {
				System.out.println("READ: " + str);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
