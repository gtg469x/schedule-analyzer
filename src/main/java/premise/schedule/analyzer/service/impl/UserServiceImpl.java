package premise.schedule.analyzer.service.impl;

import premise.schedule.analyzer.dao.UserDAO;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	@Override
	public void createUser(User user) {
		userDAO.createUser(user);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
