package com.blogspot.francisoud.instrospection;

public class Main {

	private static int LOOP = 10000;

	public static void main(String[] args) {
		MyBean bean = new MyBean();
		System.out.println(bean.toStringManual());
		System.out.println(bean.toStringApache());

		long before = System.currentTimeMillis();
		for (int i = 0; i < LOOP; i++) {
			bean.toStringManual();
		}
		long after = System.currentTimeMillis();
		final long elapsedManual = after - before;
		System.out.println("elapsed manual: " + elapsedManual);

		before = System.currentTimeMillis();
		for (int i = 0; i < LOOP; i++) {
			bean.toStringApache();
		}
		after = System.currentTimeMillis();
		final long elapsedApache = after - before;
		System.out.println("elapsed apache: " + elapsedApache);
		
		System.out.println("diff: " + (elapsedApache - elapsedManual) + "ms");
	}

}
