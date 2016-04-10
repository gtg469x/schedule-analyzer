package premise.schedule.analyzer.service;

import java.util.List;

import org.joda.time.DateTime;

import premise.schedule.analyzer.model.ShiftViolations;
import premise.schedule.analyzer.model.User;

public interface ViolationWorker {

	List<ShiftViolations> analyze(User user, DateTime start, DateTime end);
}
