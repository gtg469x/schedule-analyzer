package premise.schedule.analyzer.dao;

import java.util.List;

import premise.schedule.analyzer.model.Shift;

public interface ShiftDAO extends HibernateDAO<Shift>{

	List<Shift> getShiftsForUserId(Long userId);
	
	void inputShift(Shift shift);
}
