package premise.schedule.analyzer.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.reflect.TypeToken;

import premise.schedule.analyzer.dao.HibernateDAO;

public class HibernateDAOImpl<T> implements HibernateDAO<T>{
	
	private SessionFactory sessionFactory;
	
	private Class<T> clazz;
	
	public HibernateDAOImpl(){
		getType();
	}

	@Transactional
	@Override
	public T get(Long id) {
		return (T) getCurrentSession().get(clazz, id);
	}

	@Transactional
	@Override
	public void write(T object) {
		getCurrentSession().saveOrUpdate(object);
	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	private void getType(){
		@SuppressWarnings("serial")
		TypeToken<T> type = new TypeToken<T>(getClass()){};
		clazz = (Class<T>) type.getType();
	}

}
