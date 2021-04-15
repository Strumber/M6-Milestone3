package com.jobs.domain;



class Salary_err extends Exception {

	private String message;

	public Salary_err() {

	}

	public Salary_err(String message) {
		super();
		this.setMessage(message);
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
