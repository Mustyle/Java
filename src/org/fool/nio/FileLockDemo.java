package org.fool.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("out.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		FileChannel fout = fos.getChannel();
		
		FileLock lock = fout.tryLock();	// ��ͼ��ô�ͨ�����ļ���
		
		if(lock != null) {
			System.out.println(file.getName() + "�ļ�����100��");
			Thread.sleep(100000);
			
			lock.release();	// �ͷ��ļ���
			System.out.println(file.getName() + "�ļ��������");
		}
		
		fout.close();
		fos.close();
	}
}
