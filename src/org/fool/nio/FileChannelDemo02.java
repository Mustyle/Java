package org.fool.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * ʹ��ͨ�����ж�д����
 */
public class FileChannelDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("out.txt"));
		FileOutputStream fos = new FileOutputStream(new File("out.dat"));

		FileChannel fin = fis.getChannel();
		FileChannel fout = fos.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(1024);

		while (fin.read(buf) != -1) {
			buf.flip(); // ���軺����
			fout.write(buf); // ���������
			buf.clear(); // ��ջ�����
		}

		fin.close();
		fout.close();
		fis.close();
		fos.close();
	}
}
