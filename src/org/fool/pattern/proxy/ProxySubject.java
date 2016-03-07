package org.fool.pattern.proxy;

public class ProxySubject implements Subject {
	
	private RealSubject realSubject;	// �����ɫ����ɵ�����

	@Override
	public void request() {
		this.preRequest();	// ����ʵ��ɫ����֮�������ӵĲ������Ǳ��룩
		
		if(null == realSubject) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();	// ��ʵ��ɫ����ɵ�����
		
		this.postRequest();	// ����ʵ��ɫ֮�������ӵĲ������Ǳ��룩
	}
	
	private void preRequest() {
		System.out.println("pre request");
	}
	
	private void postRequest() {
		System.out.println("post request");
	}

}
