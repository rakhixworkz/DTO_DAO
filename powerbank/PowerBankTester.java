package com.xworkz.powerbank;
import com.xworkz.powerbank.dao.PowerbankDAO;
import com.xworkz.powerbank.dto.PowerBankDTO;
public class PowerBankTester {

	public static void main(String[] args) {
	System.out.println("Inside main");
	PowerBankDTO mi=new PowerBankDTO("MI",2000,1000,"white");
	PowerbankDAO powerbankDAO=new PowerbankDAO();
	powerbankDAO.displayPowerbankDTO(mi);
	}

}
