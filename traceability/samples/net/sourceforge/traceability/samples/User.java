package net.sourceforge.traceability.samples;

import java.util.Date;

public class User {

	public static User ROOT = new User("root", "password");

	public static User ADMIN = new User("admin", "password");

	public static User DOE = new User("john_doe", "password");

	// public enum DEFAULT_USERS {User.ROOT, User.ADMIN, User.DOE};

	/*
	 * public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	 * SATURDAY }
	 * 
	 * public enum User { ROOT ("root", "password"), ADMIN("admin", "password"),
	 * DOE("john_doe", "password"); }
	 */

	private long id;

	private String login;

	private String password;

	private Date date;

	public User() {
	}

	public User(final String login, final String password) {
		this.login = login;
		this.password = password;
		this.date = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return login + "/" + password;
	}
}
