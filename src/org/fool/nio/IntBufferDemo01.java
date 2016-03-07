package org.fool.nio;

import java.nio.IntBuffer;

/*
 * Buffer基本操作
 */
public class IntBufferDemo01 {
	public static void main(String[] args) {
		IntBuffer buf = IntBuffer.allocate(10); // 开辟10个大小的缓冲区

		System.out.println("1.Before");

		System.out.println(
				"position = " + buf.position() + ", limit = " + buf.limit() + ", capacity = " + buf.capacity());

		int temp[] = { 5, 7, 9 };
		buf.put(3);
		buf.put(temp);

		System.out.println("2.After");

		System.out.println(
				"position = " + buf.position() + ", limit = " + buf.limit() + ", capacity = " + buf.capacity());

		buf.flip(); // 重设缓冲区

		System.out.println("3.Prepare to print data");

		System.out.println(
				"position = " + buf.position() + ", limit = " + buf.limit() + ", capacity = " + buf.capacity());
		
		System.out.println("The content is: ");
		
		while(buf.hasRemaining()) {
			System.out.println(buf.get());
		}

	}
}
