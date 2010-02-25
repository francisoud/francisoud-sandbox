package fr.blogspot.francisoud.webapp;

public class MyService {

	public void longMethod() {
		System.out.println("longMethod");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void shortMethod() {
		System.out.println("shortMethod");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public void instantMethod() {
		System.out.println("instantMethod");
	}
}
