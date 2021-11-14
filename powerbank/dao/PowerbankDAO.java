package com.xworkz.powerbank.dao;
import com.xworkz.powerbank.dto.PowerBankDTO;
public class PowerbankDAO {
	public PowerbankDAO() {
		System.out.println("Inside Powerbank DAO");
	}
	public void displayPowerbankDTO(PowerBankDTO dto) {
		System.out.println(dto.getBrand());
		System.out.println(dto.getColor());
		System.out.println(dto.getPrice());
	}
}
