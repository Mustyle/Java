package org.fool.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
	public static void main(String[] args) {
		/**
		 * �����ú�ǰ��������á������ò�ͬ��������Ӱ�������������ڡ���java����java.lang.ref.PhantomReference���ʾ��
		 * ���һ�������������ù��������û��������֮����һ�������κ�ʱ�򶼿��ܱ��������������ա�
		 * Ҫע����ǣ������ñ�������ö��й���ʹ�ã�������������׼������һ������ʱ��
		 * ������������������ã��ͻ����������ü��뵽��֮ ���������ö����С�
		 * �������ͨ���ж����ö������Ƿ��Ѿ������������ã����˽ⱻ���õĶ����Ƿ�Ҫ���������ա�
		 * ���������ĳ���������Ѿ������뵽���ö��У���ô�Ϳ����������õĶ�����ڴ汻����֮ǰ��ȡ��Ҫ���ж���
		 */
		
		ReferenceQueue<String> queue = new ReferenceQueue<>();

		PhantomReference<String> pr = new PhantomReference<>(new String("hello"), queue);
	
		System.out.println(pr.get());	// null
		
		System.gc();
		
		System.out.println(pr.get());	// null
	}
}
