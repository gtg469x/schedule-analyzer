package premise.schedule.analyzer.service.impl;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.ShiftViolations;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.model.Violation;

public class LongShiftViolationWorkerImpl extends AbstractViolationWorkerImpl{
	
	Violation type = Violation.TWENTYFOUR_HOUR_SHIFT;

	@Override
	public List<ShiftViolations> analyze(User user, DateTime start, DateTime end) {
		//Analyze for violation within start/end range and create shift violation objects to return;
		return null;
	}

}
