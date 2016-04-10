package premise.schedule.analyzer.dao;

import org.hibernate.Session;

public interface HibernateDAO<T> {
	
	T get(Long id);
	
	void write(T object);
}
