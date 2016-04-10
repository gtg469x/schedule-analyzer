package premise.schedule.analyzer.dao.impl;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.dao.ShiftDAO;
import premise.schedule.analyzer.model.Shift;

public class ShiftDAOImpl extends HibernateDAOImpl<Shift> implements ShiftDAO {

	@SuppressWarnings("unchecked")
	@Override
	//with my luck i have my </> backwards on start and end times
	public List<Shift> getShiftsForUserId(Long userId, DateTime start, DateTime end) {
		return (List<Shift>) getCurrentSession()
				.createQuery("Select from Shift where user.id=:id and start <=:start and end >=:end")
				.setParameter("id", userId)
				.setParameter("start", start)
				.setParameter("end", end)
				.list();
	}

	@Override
	public void inputShift(Shift shift) {
		write(shift);
	}

	@Override
	public List<Shift> getShiftsAboveFourWeekThreshold() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shift> getShiftsTooCloseTogether() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasFullDayOffDuringWeek() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Shift> getShiftsLongerThanDay() {
		// TODO Auto-generated method stub
		return null;
	}
}
