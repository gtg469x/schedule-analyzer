package premise.schedule.analyzer.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import premise.schedule.analyzer.dao.HibernateDAO;

public class HibernateDAOImpl<T> implements HibernateDAO<T>{

	@Transactional
	@Override
	public T get(Long id) {
		
		
	}

	@Transactional
	@Override
	public void write(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getCurrentSession() {
		// TODO Auto-generated method stub
		
	}

}
