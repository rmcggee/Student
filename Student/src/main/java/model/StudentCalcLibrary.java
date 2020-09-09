package model;

public class StudentCalcLibrary {

	
/**
 * RMcGee - If Student has GPA > 1.75 they are considered in good standing
 * @param student
 * @return
 */
	
	public Boolean isGoodStanding(Student student) {
		Boolean goodStandingIndicator = false;
		final double lowRangeGoodStandingGPA = 1.75;
		
		if (student.getCurrentGPA() > lowRangeGoodStandingGPA) {
			goodStandingIndicator = true;
		} else {
			goodStandingIndicator = false;
		}
		
		return goodStandingIndicator;
	}
	
}
