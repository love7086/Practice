package com.yingda.mianshi.DynamicProxy;

public class MiStore implements ImiSeller {
	@Override
	public void buy() {
		System.out.println("We bought something from MI store!");
	}
}
