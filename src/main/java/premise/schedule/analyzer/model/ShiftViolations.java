package premise.schedule.analyzer.model;

import java.util.List;

//mapper for violation type and shifts in violation
public class ShiftViolations {
	
	private Violation violation;
	
	private List<Shift> shifts;

	public Violation getViolation() {
		return violation;
	}

	public void setViolation(Violation violation) {
		this.violation = violation;
	}

	public List<Shift> getShifts() {
		return shifts;
	}

	public void setShifts(List<Shift> shifts) {
		this.shifts = shifts;
	}

}
