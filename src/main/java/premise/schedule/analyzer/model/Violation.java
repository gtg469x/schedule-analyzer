package premise.schedule.analyzer.model;

public enum Violation {
	EIGHTY_HOURS("Residents limited to avg 80 hours/week in 4 week period."),
	TWENTYFOUR_HOURS_OFF("Residents must have a continuous 24 hours off in one week period"),
	TWENTYFOUR_HOUR_SHIFT("Resident Shifts cannot exceed 24 hours"),
	EIGHT_HOURS_BETWEEN("Resident must have minimum 8 hours between shifts");
	
	private String description;
	
	Violation(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return description;
	}
}
