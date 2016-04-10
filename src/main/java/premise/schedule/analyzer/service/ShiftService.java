package premise.schedule.analyzer.service;

import java.util.List;

import premise.schedule.analyzer.model.Shift;
import premise.schedule.analyzer.model.User;

public interface ShiftService {
	
	void inputShift(Shift shift);
	
	Shift getShiftInfo(Long shiftId);
	
	List<Shift> getShiftsForUser(User user);

}
