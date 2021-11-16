package com.xworkz.DB.Dao;

public class CompanyB implements DBOperations{

	public void connectDb(String user, String pass) {
		System.out.println("Company B connect logic!!DB conneted");
	}

	public void save(String name, String place) {
		System.out.println("Company B save logic!!DB saved");
	}

	public void delete(String name) {
		System.out.println("Company B delete logic!!DB deleled");
	}

	public void update(String name, String place) {
		System.out.println("Company B update logic!!DB updated");
	}

}
