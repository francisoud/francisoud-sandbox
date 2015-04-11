package net.sourceforge.traceability.samples;

import net.sourceforge.traceability.annotations.requirements.Requirement;
import net.sourceforge.traceability.annotations.requirements.Requirements;
import net.sourceforge.traceability.annotations.requirements.RequirementsIds;
import net.sourceforge.traceability.annotations.usecases.UseCase;

@UseCase(id = "UseCase-Register", decription = "allow a user to register into application")
public class UserService {

	public UserService() {
	}

	@Requirement(id = "REQ_01", author = "benjamin", currentRevision = "1.0", date = "3/17/2002", lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
			"Alice", "Bob", "Cindy" }, junit = "net.sourceforge.traceability.annotations.samples.UserServiceTest#testRegister")
	public long register(final User user) {
		final UserDao dao = new UserDao(user);
		return dao.save();
	}

	// This is beginning to be ugly you'd rather user @RequirementsIds instead
	// of this ;)
	@Requirements(requirements = {
			@Requirement(id = "REQ_02", author = "benjamin", currentRevision = "1.0", date = "3/17/2002", lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
					"Alice", "Bob", "Cindy" }, junit = "net.sourceforge.traceability.annotations.samples.UserServiceTest#changePassword"),
			@Requirement(id = "REQ_01", author = "benjamin", currentRevision = "1.0", date = "3/17/2002", lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
					"Alice", "Bob", "Cindy" }, junit = "net.sourceforge.traceability.annotations.samples.UserServiceTest#changePassword") })
	public boolean changePassword(final User user, final String password) {
		user.setPassword(password);
		final UserDao dao = new UserDao(user);
		return dao.update();
	}

	@RequirementsIds(ids = { "REQ_01", "REQ_02", "REQ_03" })
	public boolean delete(final User user) {
		final UserDao dao = new UserDao(user);
		return dao.delete();
	}
}
