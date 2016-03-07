package org.fool.nio;

import java.nio.ByteBuffer;

/*
 * 创建直接缓冲区
 * 在缓冲区操作类中，只有ByteBuffer可以创建直接缓冲区
 * 这样JVM将尽最大努力直接对其执行本机的IO操作
 */
public class ByteBufferDemo01 {
	public static void main(String[] args) {
		ByteBuffer buf = ByteBuffer.allocateDirect(10);	// 开辟直接缓冲区
		byte temp[] = {1, 3, 5, 7, 9};
		buf.put(temp);
		buf.flip();	// 重设缓冲区
		
		while(buf.hasRemaining()) {
			System.out.println(buf.get());
		}
	}
}
