package premise.schedule.analyzer.dao;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.Shift;

public interface ShiftDAO extends HibernateDAO<Shift>{
	
	void inputShift(Shift shift);

	List<Shift> getShiftsForUserId(Long userId, DateTime start, DateTime end);
	
	List<Shift> getShiftsAboveFourWeekThreshold();
	
	List<Shift> getShiftsTooCloseTogether();
	
	boolean hasFullDayOffDuringWeek();
	
	List<Shift> getShiftsLongerThanDay();
}
