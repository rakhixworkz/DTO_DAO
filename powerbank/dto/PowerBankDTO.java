package com.xworkz.powerbank.dto;

public class PowerBankDTO {
	private String brand;
	private int price;
	private int mah;
	private String color;
	public PowerBankDTO(String brand, int price, int mah, String color) {
		this.brand = brand;
		this.price = price;
		this.mah = mah;
		this.color = color;
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
	public int getMah() {
		return mah;
	}
	public void setMah(int mah) {
		this.mah = mah;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
