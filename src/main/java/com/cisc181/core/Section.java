package com.cisc181.core;
import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int roomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		this.roomID = roomID;
	}
	// didn't implement methods because the question didn't ask for them.
	// Have them here for testing though.
	/* public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}*/
}
