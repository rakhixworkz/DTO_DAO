package com.xworkz.bulb.dao;
import com.xworkz.bulb.dto.BulbDTO;
public class BulbDAO {
	public  BulbDAO() {
		System.out.println("Inside Dao constructor");
	}
	public BulbDTO createBulbDto(int serialNumber,String brand,int price,int volt,String color) {
		System.out.println("Inside create method");
		BulbDTO bulbDTO=new BulbDTO(serialNumber,brand,volt,price,color);
		return bulbDTO;
	}
	public void displayBulbDTO(BulbDTO dto) {
		System.out.println("Inside display method");
		System.out.println(dto.getSerialNumber());
		System.out.println(dto.getBrand());
		System.out.println(dto.getVolt());
	}
	

}
