package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	// instance variables
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double grade;
	
	// making no-arg private so it's inaccessible
	private Enrollment() {
		// nothing in here
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
}
