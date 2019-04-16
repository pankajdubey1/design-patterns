package com.designpatterns.creational.singlton;

public class LazySinglton {

	private static volatile LazySinglton singlton;

	private LazySinglton() {
	}

	public static LazySinglton getInstance() {
		if (singlton == null) {
			synchronized (LazySinglton.class) {
				if (singlton == null)
					singlton = new LazySinglton();
			}
		}
		return singlton;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
