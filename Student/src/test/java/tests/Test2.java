package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Student;

public class Test2 {
	// Ruth McGee
	Student myStudent2 = new Student("Kent Miller");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetAge() {
		myStudent2.setAge(18);
		int myAge = myStudent2.getAge();
		assertEquals(18, myAge, 0);
	}
	

	@Test
	public void TestGetFullName() {
		String myTestName = myStudent2.getFullName();
		assertEquals("Kent Miller", myTestName);
	}
}
