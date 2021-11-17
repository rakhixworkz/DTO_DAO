package com.xworkz.Scanner.DTO;

public class ScannerDto {
	private String brand;
	private String type;
	private int price;
	private String color;
	public ScannerDto(String brand, String type, int price, String color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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

}
