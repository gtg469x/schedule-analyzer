package premise.schedule.analyzer.service;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.Shift;
import premise.schedule.analyzer.model.User;

public interface ShiftService {
	
	void inputShift(Shift shift);
	
	Shift getShiftInfo(Long shiftId);
	
	List<Shift> getShiftsForUser(User user, DateTime start, DateTime end);
	
	List<Shift> getShiftsAboveFourWeekThreshold();
	
	List<Shift> getShiftsTooCloseTogether();
	
	boolean hasFullDayOffDuringWeek();
	
	List<Shift> getShiftsLongerThanDay();

}
