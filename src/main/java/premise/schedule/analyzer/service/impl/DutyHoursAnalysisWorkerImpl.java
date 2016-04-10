package premise.schedule.analyzer.service.impl;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.util.CollectionUtils;

import premise.schedule.analyzer.model.ShiftViolations;
import premise.schedule.analyzer.model.User;
import premise.schedule.analyzer.model.UserSummary;
import premise.schedule.analyzer.service.ShiftService;
import premise.schedule.analyzer.service.ViolationWorker;

public class DutyHoursAnalysisWorkerImpl {

	ShiftService shiftService;
	
	//ideally injected from spring: one violation worker for each type of violation.
	List<ViolationWorker> violationWorkers;
	
	public UserSummary performAnalysis(User user, DateTime start, DateTime end){
		UserSummary summary = new UserSummary();
		summary.setUser(user);
		if(!CollectionUtils.isEmpty(violationWorkers) && user !=null){
			//probably need task executor, 
			//but need to review how parallel stream works on the back end
			
			violationWorkers
					.parallelStream()
					.forEach(worker -> {
						List<ShiftViolations> shiftViolations = worker.analyze(user, start, end);
						summary.addShiftViolations(shiftViolations);
					});
		}
		
		summary.setShifts(shiftService.getShiftsForUser(user, start, end));
		
		return summary;
	}

	public List<ViolationWorker> getViolationWorkers() {
		return violationWorkers;
	}

	public void setViolationWorkers(List<ViolationWorker> violationWorkers) {
		this.violationWorkers = violationWorkers;
	}

	public ShiftService getShiftService() {
		return shiftService;
	}

	public void setShiftService(ShiftService shiftService) {
		this.shiftService = shiftService;
	}
}
