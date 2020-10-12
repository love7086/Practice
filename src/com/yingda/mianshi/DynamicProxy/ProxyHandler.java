package com.yingda.mianshi.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	Object obj;

	public ProxyHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before...");
		Object result = method.invoke(obj, args);
		System.out.println("After...");
		return result;
	}
}
