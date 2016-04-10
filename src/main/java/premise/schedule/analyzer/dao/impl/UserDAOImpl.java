package premise.schedule.analyzer.dao.impl;

import premise.schedule.analyzer.dao.UserDAO;
import premise.schedule.analyzer.model.User;

public class UserDAOImpl extends HibernateDAOImpl<User> implements UserDAO {
	
	@Override
	public void createUser(User user){
		write(user);
	}
}
