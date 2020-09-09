package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.StudentCalcLibrary;
import model.Student;

public class Test1 {

	// Ruth McGee
	StudentCalcLibrary StCalcLibrary = new StudentCalcLibrary();
	Student myStudent1 = new Student("Mary Brown");


	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testIsGoodStanding() {
		myStudent1.setCurrentGPA(3.7);
		assertTrue(StCalcLibrary.isGoodStanding(myStudent1));


	}

	@Test
	public void testNotGoodStanding() {
		myStudent1.setCurrentGPA(1.5);
		assertFalse(StCalcLibrary.isGoodStanding(myStudent1));


	}



}
