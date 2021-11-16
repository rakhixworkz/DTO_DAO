package com.xworkz.DB.Dao;

public class Tester {

	public static void main(String[] args) {
		CompanyA companyA=new CompanyA();
		companyA.connectDb("abc", "abc");
		companyA.delete("abc");
		companyA.update("abc","abs");
	}

}
