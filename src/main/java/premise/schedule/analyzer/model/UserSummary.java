package premise.schedule.analyzer.model;

import java.util.List;

public class UserSummary {
	
	private User user;
	
	private List<Shift> shifts;
	
	private List<ShiftViolations> shiftViolations;
	
	private Object lock = new Object();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Shift> getShifts() {
		return shifts;
	}

	public void setShifts(List<Shift> shifts) {
		this.shifts = shifts;
	}

	public List<ShiftViolations> getShiftViolations() {
		return shiftViolations;
	}

	public void setShiftViolations(List<ShiftViolations> shiftViolations) {
		this.shiftViolations = shiftViolations;
	}

	public void addShiftViolations(List<ShiftViolations> moreViolations){
		//is addAll thread safe???  just in case, lock on lock object
		synchronized (lock) {
			shiftViolations.addAll(moreViolations);
		}
	}
	

}
