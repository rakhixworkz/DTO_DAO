package com.xworkz.OnlineShopping.Dao;

public class Myntra implements OnlineShoppingOperationsDao {
	public void placeOrder() {
		System.out.println("order placed successfully!!through myntra");
	}
	public void viewOrder() {
		System.out.println("order viewed successfully!!through myntra");
	}
	public void trackorder() {
		System.out.println("Tracking orders!!through myntra");
	}

}
