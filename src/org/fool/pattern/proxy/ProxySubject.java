package org.fool.pattern.proxy;

public class ProxySubject implements Subject {
	
	private RealSubject realSubject;	// 代理角色所完成的事情

	@Override
	public void request() {
		this.preRequest();	// 在真实角色操作之后所附加的操作（非必须）
		
		if(null == realSubject) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();	// 真实角色所完成的事情
		
		this.postRequest();	// 在真实角色之后所附加的操作（非必须）
	}
	
	private void preRequest() {
		System.out.println("pre request");
	}
	
	private void postRequest() {
		System.out.println("post request");
	}

}
