package org.fool.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * ʹ��ͨ�����ж�д����
 */
public class FileChannelDemo01 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(new File("out.txt"));

		FileChannel fout = fos.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(1024);

		String info[] = { "Java", "NIO", "File Channel" };

		for (String str : info) {
			buf.put(str.getBytes());
		}

		buf.flip(); // ���軺������׼�����

		fout.write(buf);
		fout.close();
		fos.close();
	}
}
