package org.fool.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
	public static void main(String[] args) {
		/**
		 * ������Ҳ�����������Ǳ������ģ���JVM������������ʱ�������ڴ��Ƿ���㣬������ձ������ù����Ķ���
		 * ��java�У���java.lang.ref.WeakReference������ʾ��
		 */
		WeakReference<String> wr = new WeakReference<>(new String("hello"));
		
		System.out.println(wr.get());	// hello
		
		System.gc();
		
		System.out.println(wr.get());	// null
		/**
		 * �ڶ�����������null����˵��ֻҪJVM�����������գ��������ù����Ķ���ض��ᱻ���յ���
		 * ����Ҫע����ǣ�������˵�ı������ù����Ķ�����ָֻ����������֮������
		 * �������ǿ����ͬʱ��֮�������������������ʱҲ������ոö���������Ҳ����ˣ���
		 * �����ÿ��Ժ�һ�����ö��У�ReferenceQueue������ʹ�ã�
		 * ��������������õĶ���JVM���գ���������þͻᱻ���뵽��֮���������ö����С�
		 */
	}
}
