package com.xworkz.OnlineShopping.Dao;

public class Amazon implements OnlineShoppingOperationsDao {
	public void placeOrder() {
		System.out.println("order placed successfully!!through Amazon");
	}
	public void viewOrder() {
		System.out.println("order viewed successfully!!through Amazon");
	}
	public void trackorder() {
		System.out.println("Tracking orders!!through Amazon");
	}

}
