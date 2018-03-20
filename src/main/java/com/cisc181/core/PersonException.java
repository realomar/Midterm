package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	
	private Person testPerson;
	
	// blank constructor
	public PersonException() {}
	
	// constructor that adds a message
	public PersonException(String problem) {
		super(problem);
	}
}