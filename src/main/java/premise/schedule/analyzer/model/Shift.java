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
}
