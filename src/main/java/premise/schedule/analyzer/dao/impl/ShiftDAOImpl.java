package premise.schedule.analyzer.dao.impl;

import java.util.List;

import premise.schedule.analyzer.dao.ShiftDAO;
import premise.schedule.analyzer.model.Shift;

public class ShiftDAOImpl extends HibernateDAOImpl<Shift> implements ShiftDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Shift> getShiftsForUserId(Long userId) {
		return (List<Shift>) getCurrentSession()
				.createQuery("Select from Shift where user.id=:id")
				.setParameter("id", userId)
				.list();
	}

	@Override
	public void inputShift(Shift shift) {
		write(shift);
	}

}
