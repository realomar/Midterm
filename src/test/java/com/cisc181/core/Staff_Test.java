package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		try {
		staffList.add(new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-555-1234", "omar@example.org",
				"9-5", 1, 50000.0, new Date(),eTitle.MR));
		staffList.add(new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-555-1234", "omar@example.org",
				"9-5", 1, 60000.0, new Date(),eTitle.MR));
		staffList.add(new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-555-1234", "omar@example.org",
				"9-5", 1, 70000.0, new Date(),eTitle.MR));
		staffList.add(new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-555-1234", "omar@example.org",
				"9-5", 1, 80000.0, new Date(),eTitle.MR));
		staffList.add(new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-555-1234", "omar@example.org",
				"9-5", 1, 90000.0, new Date(),eTitle.MR));
		}
		catch(PersonException e){fail("Unexpected PersonException");}
		
		// calculating mean salary.
		double mean = 0.0;
		for(Staff s : staffList) {
			mean += s.getSalary();
		}
		mean /= 5;
		
		if(mean != 70000.0) {fail("Incorrect average salary.");}
		// I tried using assertEquals but it kept saying "deprecated."
	}	
	
	// testing exception thrown when phone number is invalid
	@Test(expected = PersonException.class)
	public void testPhone() throws PersonException {
		Staff testStaff = new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-55-1234", "omar@example.org",
				"9-5", 1, 90000.0, new Date(),eTitle.MR);
	}
	
	// testing exception thrown when age is invalid
	@Test(expected = PersonException.class) 
	public void testDOB() throws PersonException{
		Staff testStaff = new Staff("Omar", "S", "Ahmad",
				new Date(), "1553 Example Drive", "(248)-55-1234", "omar@example.org",
				"9-5", 1, 90000.0, new Date(),eTitle.MR);
		Calendar cal = Calendar.getInstance();
		cal.set(1776, Calendar.JULY, 4);
		testStaff.setDOB(cal.getTime());
	}
}