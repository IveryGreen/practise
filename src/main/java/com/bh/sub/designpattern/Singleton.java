package com.bh.sub.designpattern;

public class Singleton {

	private static Singleton singleObj;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleObj == null) {
			synchronized (Singleton.class) {
				if (singleObj == null) {
					singleObj = new Singleton();
				}
			}
		}
		return singleObj;
	}
}
