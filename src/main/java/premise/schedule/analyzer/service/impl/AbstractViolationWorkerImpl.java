package premise.schedule.analyzer.service.impl;

import premise.schedule.analyzer.service.ShiftService;
import premise.schedule.analyzer.service.ViolationWorker;

public abstract class AbstractViolationWorkerImpl implements ViolationWorker {
	
	private ShiftService shiftService;

	public ShiftService getShiftService() {
		return shiftService;
	}

	public void setShiftService(ShiftService shiftService) {
		this.shiftService = shiftService;
	}
}
