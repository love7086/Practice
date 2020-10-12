package com.yingda.mianshi.DynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxy {

	public static void main(String[] args) {
		IKFC kfc = (IKFC) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(), new Class[] { IKFC.class },
				new ProxyHandler(new KFC()));
		kfc.eat();

		ImiSeller imo = (ImiSeller) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),
				MiStore.class.getInterfaces(), new ProxyHandler(new MiStore()));
		imo.buy();
	}
}
