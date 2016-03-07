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
		
		FileLock lock = fout.tryLock();	// 试图获得此通道的文件锁
		
		if(lock != null) {
			System.out.println(file.getName() + "文件锁定100秒");
			Thread.sleep(100000);
			
			lock.release();	// 释放文件锁
			System.out.println(file.getName() + "文件解除锁定");
		}
		
		fout.close();
		fos.close();
	}
}
