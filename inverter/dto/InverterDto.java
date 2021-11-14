package com.xworkz.inverter.dto;

public class InverterDto {
	String brand;
	int price;
	String color;
	int batteryCapacity;
	public InverterDto(String brand, int price, String color, int batteryCapacity) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.batteryCapacity = batteryCapacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
