package com.xworkz.Scanner.DAO;
import com.xworkz.Scanner.DTO.ScannerDto;

public class ScannerImplDao extends ScannerDto implements ScannerDao {

	public ScannerImplDao(String brand, String type, int price, String color) {
		super(brand, type, price, color);
		System.out.println("Inside a DAO constructor");
	}

	public ScannerDto createScannerObject(String brand, String type, int price, String color) {
		System.out.println("Inside create method");
		ScannerDto scannerDTO = new ScannerDto(brand, type, price, color);
		return scannerDTO;
	}

	public ScannerDto updateTypeByColor(ScannerDto obj, String type) {
		System.out.println("Inside update method");
		obj.setType(type);
		return obj;
	}

	public void displayInfo(ScannerDto obj) {
		System.out.println("Inside the display method");
		System.out.println(obj.getBrand());
		System.out.println(obj.getType());
		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());
	}

	

}