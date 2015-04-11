package net.sourceforge.traceability.samples;

public class UserDao {

	private final User user;

	public UserDao(final User user) {
		this.user = user;
	}

	public long save() {
		System.out.println("Saving User: " + user.toString());
		return System.currentTimeMillis();
	}

	public boolean update() {
		System.out.println("Updating User: " + user.toString());
		return true;
	}

	public boolean delete() {
		System.out.println("Deleting User: " + user.toString());
		return true;
	}
}
