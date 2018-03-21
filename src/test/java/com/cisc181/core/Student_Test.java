package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Semester> semesters = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	private static ArrayList<Student> students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {
		semesters.add(new Semester(UUID.randomUUID(),new Date(), new Date()));
		semesters.add(new Semester(UUID.randomUUID(),new Date(), new Date()));
		
		courses.add(new Course(UUID.randomUUID(), "Name", 2, eMajor.COMPSI));
		courses.add(new Course(UUID.randomUUID(), "Name", 3, eMajor.COMPSI));
		courses.add(new Course(UUID.randomUUID(), "Name", 4, eMajor.COMPSI));
		
		sections.add(new Section(courses.get(0).getCourseID(),semesters.get(0).getSemesterID(),UUID.randomUUID(), 0));
		sections.add(new Section(courses.get(0).getCourseID(),semesters.get(1).getSemesterID(),UUID.randomUUID(), 0));
		sections.add(new Section(courses.get(1).getCourseID(),semesters.get(0).getSemesterID(),UUID.randomUUID(), 0));
		sections.add(new Section(courses.get(1).getCourseID(),semesters.get(1).getSemesterID(),UUID.randomUUID(), 0));
		sections.add(new Section(courses.get(2).getCourseID(),semesters.get(0).getSemesterID(),UUID.randomUUID(), 0));
		sections.add(new Section(courses.get(2).getCourseID(),semesters.get(1).getSemesterID(),UUID.randomUUID(), 0));
		
		while(students.size() < 10) {
			try{students.add(new Student("Omar", "S", "Ahmad",new Date(), eMajor.COMPSI,
					"1553 Example road", "(248)-555-1234", "omar@example.org"));}
			catch(Exception e) {fail("Couldn't add student.");}
		}
	}

	@Test
	public void test() {
		
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Section s : sections) {
			for(Student p : students) {
				enrollments.add(new Enrollment(p.getStudentID(),s.getSectionID()));
		}
	}
	
	for(Enrollment e : enrollments) {
		e.setGrade(3.5);
		}
	// I got stuck here ¯\_(ツ)_/¯
}}