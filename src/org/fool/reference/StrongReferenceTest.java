package org.fool.reference;

public class StrongReferenceTest {
	public static void main(String[] args) {
		new StrongReferenceTest().test();
	}

	public void test() {
		/**
		 * ǿ���þ���ָ�ڳ������֮���ձ���ڵģ�����������δ����е�object��objects����ǿ����
		 * ֻҪĳ��������ǿ������֮������JVM�ض��������������󣬼�ʹ���ڴ治�������£�
		 * JVM��Ը�׳�OutOfMemory����Ҳ����������ֶ���
		 */
		Object object = new Object();
		Object[] objects = new Object[100];
		/**
		 * ��������Object[] objArr = new Object[100];���ʱ������ڴ治�㣬JVM���׳�OOM����Ҳ�������objectָ��Ķ���
		 * ����Ҫע����ǣ���test������֮��object��objects���Ѿ��������ˣ���������ָ��Ķ��󶼻ᱻJVM���ա�
		 * ������ж�ǿ���ú�ĳ������֮��Ĺ�����������ʾ�ؽ����ø�ֵΪnull������һ���Ļ���JVM�ں��ʵ�ʱ��ͻ���ոö���
		 */
	}
}
