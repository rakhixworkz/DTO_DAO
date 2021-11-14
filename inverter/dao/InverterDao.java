package com.xworkz.inverter.dao;
import com.xworkz.inverter.dto.InverterDto;
public class InverterDao {
	public InverterDao() {
		System.out.println("Inside a inverter DAO");
	}
	InverterDto inverter[]=new InverterDto[4];
	int index=0;
	public void saveDto(InverterDto obj) {
		inverter[index]=obj;
		index++;
	}
	public void displayInfo() {
		for(int i=0;i<inverter.length;i++) {
			System.out.println(inverter[i].getBrand());
			System.out.println(inverter[i].getPrice());
			System.out.println(inverter[i].getColor());
			System.out.println(inverter[i].getBatteryCapacity());
			
		}
	}
	public void displayByBrandName(String brandName) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brandName)) {
				System.out.println(inverter[i].getBrand());
				System.out.println(inverter[i].getPrice());
				System.out.println(inverter[i].getColor());
				System.out.println(inverter[i].getBatteryCapacity());
			}
		}
	}
	public void updateBatteryCapacityByBrandName(String brandName,int newBatteryCapacity) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brandName)) {
				inverter[i].setBatteryCapacity(newBatteryCapacity);
			}
			
		}
	}
	public void deleteByBrandName(String brand) {
		for(int i=0;i<inverter.length;i++) {
			if(inverter[i].getBrand().equals(brand)) {
				inverter[i]=null;
			}
		}
	}
	public InverterDto createObject(String brand,int price,String color,int batteryCapacity) {
		InverterDto inverterDto=new InverterDto(brand,price,color,batteryCapacity);
		return inverterDto;
	}
}
