package org.fool.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * 使用通道进行读写操作
 */
public class FileChannelDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("out.txt"));
		FileOutputStream fos = new FileOutputStream(new File("out.dat"));

		FileChannel fin = fis.getChannel();
		FileChannel fout = fos.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(1024);

		while (fin.read(buf) != -1) {
			buf.flip(); // 重设缓冲区
			fout.write(buf); // 输出缓冲区
			buf.clear(); // 清空缓冲区
		}

		fin.close();
		fout.close();
		fis.close();
		fos.close();
	}
}
