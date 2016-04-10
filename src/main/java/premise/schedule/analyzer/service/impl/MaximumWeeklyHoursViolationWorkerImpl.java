package premise.schedule.analyzer.service.impl;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.ShiftViolations;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.model.Violation;

//naming things is hard.
public class MaximumWeeklyHoursViolationWorkerImpl extends AbstractViolationWorkerImpl {

	Violation type = Violation.EIGHTY_HOURS;
	
	@Override
	public List<ShiftViolations> analyze(User user, DateTime start, DateTime end) {
		//Analyze for violation between start/end
		return null;
	}

}
