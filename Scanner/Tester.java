package com.xworkz.Scanner;
import com.xworkz.Scanner.DTO.ScannerDto;
import com.xworkz.Scanner.DAO.ScannerImplDao;
import com.xworkz.Scanner.DAO.ScannerDao;
import com.xworkz.Scanner.DTO.ScannerDto;
public class Tester {

	public static void main(String[] args) {
		ScannerImplDao scannerDao=new ScannerImplDao("samsung","printer",23000,"White");
		ScannerDto samsung=scannerDao.createScannerObject("samsung","printer",23000,"White");
		scannerDao.displayInfo(samsung);
	}

}
