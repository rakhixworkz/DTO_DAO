package com.xworkz.bulb;
import com.xworkz.bulb.dto.BulbDTO;
import com.xworkz.bulb.dao.BulbDAO;

public class Test_Bulb {

	public static void main(String[] args) {
		BulbDAO bulbDao=new BulbDAO();
		BulbDTO createBulbDto=bulbDao.createBulbDto(1234, "Bajaj",120,45,"Black");
		bulbDao.displayBulbDTO(createBulbDto);
	}

}
