package org.fool.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/*
 * �ڴ�ӳ��
 */
public class FileChannelDemo03 {
	public static void main(String[] args) throws Exception {
		File file = new File("out.txt");

		FileInputStream fis = new FileInputStream(file);

		FileChannel fin = fis.getChannel();

		MappedByteBuffer mbb = fin.map(FileChannel.MapMode.READ_ONLY, 0, file.length()); // ���ļ�ӳ�䵽�ڴ���

		byte data[] = new byte[(int) file.length()];

		int i = 0;

		while (mbb.hasRemaining()) {
			data[i++] = mbb.get();
		}

		System.out.println(new String(data));

		fin.close();
		fis.close();
	}
}
