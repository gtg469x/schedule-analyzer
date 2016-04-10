package premise.schedule.analyzer.service.impl;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.ShiftViolations;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.model.Violation;
import premise.schedule.analyzer.service.ViolationWorker;

public class MinimumBetweenShiftsViolationWorkerImpl extends AbstractViolationWorkerImpl {

	Violation type = Violation.EIGHT_HOURS_BETWEEN;
	
	@Override
	public List<ShiftViolations> analyze(User user, DateTime start, DateTime end) {
		//analyze minimum time between shifts and create shift violation objects to return;
		return null;
	}
}
