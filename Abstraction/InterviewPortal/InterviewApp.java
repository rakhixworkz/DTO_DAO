package com.xworkz.Abstraction.InterviewPortal;

abstract public class InterviewApp {
	public void login(String userName,String password) {
		System.out.println("login successfully");
	}
	public void viewResult(int rollNumber) {
		System.out.println("scored 98");
	}
	abstract public void prepareQuestionsSet();
	abstract public void takeTest();
	
}
