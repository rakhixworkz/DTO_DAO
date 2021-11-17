package com.xworkz.Scanner.DAO;
import com.xworkz.Scanner.DTO.ScannerDto;

public interface ScannerDao {
	public void displayInfo(ScannerDto obj);
	public ScannerDto createScannerObject(String brand,String type,int price,String color);
	public ScannerDto updateTypeByColor(ScannerDto obj,String type);
}
