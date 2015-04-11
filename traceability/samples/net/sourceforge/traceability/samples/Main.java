package net.sourceforge.traceability.samples;

public class Main {

	public static void main(String[] args) {
		final UserService service = new UserService();
		final User root = User.ROOT;
		service.register(root);

		final User admin = User.ADMIN;
		service.register(admin);
		service.delete(admin);

		final User doe = User.DOE;
		service.register(doe);
		service.changePassword(doe, "new_password");
		service.delete(doe);
	}

}
