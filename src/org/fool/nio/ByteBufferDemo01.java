package org.fool.nio;

import java.nio.ByteBuffer;

/*
 * ����ֱ�ӻ�����
 * �ڻ������������У�ֻ��ByteBuffer���Դ���ֱ�ӻ�����
 * ����JVM�������Ŭ��ֱ�Ӷ���ִ�б�����IO����
 */
public class ByteBufferDemo01 {
	public static void main(String[] args) {
		ByteBuffer buf = ByteBuffer.allocateDirect(10);	// ����ֱ�ӻ�����
		byte temp[] = {1, 3, 5, 7, 9};
		buf.put(temp);
		buf.flip();	// ���軺����
		
		while(buf.hasRemaining()) {
			System.out.println(buf.get());
		}
	}
}
