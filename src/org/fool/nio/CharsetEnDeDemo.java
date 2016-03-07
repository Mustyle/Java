package org.fool.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/*
 * ����-�������
 */
public class CharsetEnDeDemo {
	public static void main(String[] args) throws Exception {
		Charset latin = Charset.forName("ISO-8859-1");
		CharsetEncoder encoder = latin.newEncoder();	// ʵ�����������
		CharsetDecoder decoder = latin.newDecoder();	// ʵ�����������

		// ͨ��CharBuffer���е�wrap()��������һ���ַ�����ΪCharBuffer����
		CharBuffer cb = CharBuffer.wrap("Java NIO");

		ByteBuffer buf = encoder.encode(cb); // ���б���

		System.out.println(decoder.decode(buf)); // ���н���
	}
}
