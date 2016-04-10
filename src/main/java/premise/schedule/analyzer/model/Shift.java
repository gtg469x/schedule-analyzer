package premise.schedule.analyzer.model;

import javax.persistence.Table;

import org.joda.time.DateTime;

@Table(name="shifts")
public class Shift {

	User user;
	
	//Java8 did some improvements to their date stuff
	//not sure the jodatime dependency is necessary anymore
	//but it's what I'm familiar with.
	DateTime start;
	
	DateTime end;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DateTime getStart() {
		return start;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public DateTime getEnd() {
		return end;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}
}
