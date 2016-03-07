package org.fool.nio;

import java.nio.IntBuffer;

/*
 * 创建只读缓冲区
 */
public class IntBufferDemo03 {
	public static void main(String[] args) {
		IntBuffer buf = IntBuffer.allocate(10);
		IntBuffer read = null; // 定义缓冲区对象

		for (int i = 0; i < 10; i++) {
			buf.put(2 * i + 1);
		}
		
		read = buf.asReadOnlyBuffer();	// 创建只读缓冲区
		read.flip();	// 重设缓冲区
		
		while(read.hasRemaining()) {
			System.out.println(read.get());
		}
		
		read.put(30);	// 错误，不可写
	}
}
