package org.fool.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/*
 * 编码-解码操作
 */
public class CharsetEnDeDemo {
	public static void main(String[] args) throws Exception {
		Charset latin = Charset.forName("ISO-8859-1");
		CharsetEncoder encoder = latin.newEncoder();	// 实例化编码对象
		CharsetDecoder decoder = latin.newDecoder();	// 实例化解码对象

		// 通过CharBuffer类中的wrap()方法，将一个字符串变为CharBuffer类型
		CharBuffer cb = CharBuffer.wrap("Java NIO");

		ByteBuffer buf = encoder.encode(cb); // 进行编码

		System.out.println(decoder.decode(buf)); // 进行解码
	}
}
