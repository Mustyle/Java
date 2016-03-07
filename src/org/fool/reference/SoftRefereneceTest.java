package org.fool.reference;

import java.lang.ref.SoftReference;

public class SoftRefereneceTest {
	public static void main(String[] args) {
		/**
		 * ����������������һЩ���õ������Ǳ���Ķ�����Java����java.lang.ref.SoftReference������ʾ��
		 * ���������ù����ŵĶ���ֻ�����ڴ治���ʱ��JVM�Ż���ոö�����ˣ���һ����Ժܺõ��������OOM�����⣬
		 * ����������Ժ��ʺ�����ʵ�ֻ��棺������ҳ���桢ͼƬ����ȡ�
		 * �����ÿ��Ժ�һ�����ö��У�ReferenceQueue������ʹ�ã���������������õĶ���JVM���գ���������þͻᱻ���뵽��֮���������ö����С�
		 */
		SoftReference<String> sr = new SoftReference<>(new String("hello"));
		
		System.out.println(sr.get());	// hello
		
		System.gc();
		
		System.out.println(sr.get());	// hello
	}
}
