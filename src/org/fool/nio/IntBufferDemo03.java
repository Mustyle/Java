package org.fool.nio;

import java.nio.IntBuffer;

/*
 * ����ֻ��������
 */
public class IntBufferDemo03 {
	public static void main(String[] args) {
		IntBuffer buf = IntBuffer.allocate(10);
		IntBuffer read = null; // ���建��������

		for (int i = 0; i < 10; i++) {
			buf.put(2 * i + 1);
		}
		
		read = buf.asReadOnlyBuffer();	// ����ֻ��������
		read.flip();	// ���軺����
		
		while(read.hasRemaining()) {
			System.out.println(read.get());
		}
		
		read.put(30);	// ���󣬲���д
	}
}
