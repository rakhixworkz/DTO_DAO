package com.xworkz.Abstraction.Onlineshopping;

 abstract public class ShoppingSite {
	public ShoppingSite() {
		System.out.println("Inside shopping site");
	}
	public void logIn() {
		System.out.println("Log in successfully");
	}
	public void viewOrdrs() {
		System.out.println("oreders viewed successfully");
	}
	public void logOut() {
		System.out.println("logout successfully");
	}
	abstract public void addToCart();
	abstract public void addToWishList();
	
}
