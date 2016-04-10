package premise.schedule.analyzer.service.impl;

import java.util.List;

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
	public List<Shift> getShiftsForUser(User user) {
		return shiftDAO.getShiftsForUserId(user.getId());
	}

	public ShiftDAO getShiftDAO() {
		return shiftDAO;
	}

	public void setShiftDAO(ShiftDAO shiftDAO) {
		this.shiftDAO = shiftDAO;
	}


}
