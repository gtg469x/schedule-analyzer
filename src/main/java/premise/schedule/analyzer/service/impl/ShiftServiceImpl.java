package premise.schedule.analyzer.service.impl;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.dao.ShiftDAO;
import premise.schedule.analyzer.model.Shift;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.service.ShiftService;

public class ShiftServiceImpl implements ShiftService{
	
	private ShiftDAO shiftDAO;

	@Override
	public void inputShift(Shift shift) {
		shiftDAO.inputShift(shift);
	}

	@Override
	public Shift getShiftInfo(Long shiftId) {
		return shiftDAO.get(shiftId);
	}

	@Override
	public List<Shift> getShiftsForUser(User user, DateTime start, DateTime end) {
		return shiftDAO.getShiftsForUserId(user.getId(), start, end);
	}

	public ShiftDAO getShiftDAO() {
		return shiftDAO;
	}

	public void setShiftDAO(ShiftDAO shiftDAO) {
		this.shiftDAO = shiftDAO;
	}

	@Override
	public List<Shift> getShiftsAboveFourWeekThreshold() {
		return shiftDAO.getShiftsAboveFourWeekThreshold();
	}

	@Override
	public List<Shift> getShiftsTooCloseTogether() {
		return shiftDAO.getShiftsTooCloseTogether();
	}

	@Override
	public boolean hasFullDayOffDuringWeek() {
		return shiftDAO.hasFullDayOffDuringWeek();
	}

	@Override
	public List<Shift> getShiftsLongerThanDay() {
		return shiftDAO.getShiftsLongerThanDay();
	}


}
