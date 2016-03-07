package org.fool.nio;

import java.nio.IntBuffer;

/*
 * 创建子缓冲区
 */
public class IntBufferDemo02 {
	public static void main(String[] args) {
		IntBuffer buf = IntBuffer.allocate(10);
		IntBuffer sub = null;
		
		for(int i = 0; i < 10; i++) {
			buf.put(2 * i + 1);
		}
		
		buf.position(2);	// 主缓冲区指针设置在第3个
		
		buf.limit(6);		// 主缓冲区limit为6
		
		sub = buf.slice();	// 开辟子缓冲区
		
		System.out.println(buf.capacity()); // 10
		System.out.println(sub.capacity());	// 4
		
		for(int i = 0; i < sub.capacity(); i++) {
			int temp = sub.get(i);
			sub.put(temp - 1);
		}
		
		buf.flip();			// 重设缓冲区
		
		buf.limit(buf.capacity());
		
		while(buf.hasRemaining()) {
			System.out.println(buf.get());
		}
	}
}
