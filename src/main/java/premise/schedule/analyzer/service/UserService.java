package premise.schedule.analyzer.service;

import org.springframework.security.access.prepost.PreAuthorize;

import premise.schedule.analyzer.model.User;

public interface UserService {

	@PreAuthorize("hasRole('ADMINISTRATOR')")
	void createUser(User user);
	
}
