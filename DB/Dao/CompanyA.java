package com.xworkz.DB.Dao;

public class CompanyA implements DBOperations{

	public void connectDb(String user, String pass) {
		System.out.println("company A connect logic !!DB connectd");
	}
	public void save(String name, String place) {
		System.out.println("company A save logic !!DB Saved");
	}
	public void delete(String name) {
		System.out.println("company A delete logic !!DB deleted");
	}
	public void update(String name, String place) {
		System.out.println("company A update logic !!DB updated");
	}

}
