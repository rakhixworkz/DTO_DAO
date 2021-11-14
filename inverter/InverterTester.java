package com.xworkz.inverter;
import com.xworkz.inverter.dao.InverterDao;
import com.xworkz.inverter.dto.InverterDto;
public class InverterTester {

	public static void main(String[] args) {
		InverterDao inverterDao=new InverterDao();
		InverterDto luminous=inverterDao.createObject("luminous",20000,"Black",100);
		inverterDao.saveDto(luminous);
		InverterDto altima=inverterDao.createObject("altima",20000,"Black",100);
		inverterDao.saveDto(altima);
		InverterDto exide=inverterDao.createObject("exide",20000,"Black",100);
		inverterDao.saveDto(exide);
		InverterDto livguard=inverterDao.createObject("livguard",20000,"Black",100);
		inverterDao.saveDto(livguard);
		inverterDao.displayInfo();
		System.out.println("Before update");
		inverterDao.displayByBrandName("Exide");
		inverterDao.updateBatteryCapacityByBrandName("Exide", 3000);
		System.out.println("After update");
		inverterDao.displayByBrandName("Exide");
		inverterDao.deleteByBrandName("Livguard");
		inverterDao.displayInfo();
		
		
	}

}
