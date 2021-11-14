package com.xworkz.bulb.dto;

public class BulbDTO {
	private int serialNumber;
	private String brand;
	private int volt;
	private int price;
	private String color;
	public BulbDTO(int serialnumber,String brand,int volt,int price,String color) {
		System.out.println("Inside Bulb constructor");
		this.serialNumber=serialNumber;
		this.brand=brand;
		this.volt=volt;
		this.price=price;
		this.color=color;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber=serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public int getVolt() {
		return volt;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}
