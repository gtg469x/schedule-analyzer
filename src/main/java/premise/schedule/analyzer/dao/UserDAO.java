package premise.schedule.analyzer.dao;

import premise.schedule.analyzer.model.User;

public interface UserDAO extends HibernateDAO<User> {

	void createUser(User user);
}
