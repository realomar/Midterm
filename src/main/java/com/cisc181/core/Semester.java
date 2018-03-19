package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {
	// instance vars
	private UUID SemesterID;
	private Date StartDate, EndDate;
	
	// constructor
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	// didn't implement methods because the question didn't ask for them.
	// Have them here for testing though.
	/*
	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}*/
}
