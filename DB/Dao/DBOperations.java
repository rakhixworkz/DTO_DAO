package com.xworkz.DB.Dao;

public interface DBOperations {
	public void connectDb(String user,String pass);
	public void save(String name,String place);
	public void delete(String name);
	public void update(String name,String place);
}
