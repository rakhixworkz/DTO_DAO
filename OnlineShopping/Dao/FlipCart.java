package com.xworkz.OnlineShopping.Dao;

public class FlipCart implements OnlineShoppingOperationsDao {

	public void placeOrder() {
		System.out.println("order placed successfully!!through flipcart");
	}
	public void viewOrder() {
		System.out.println("order viewed successfully!!through flipcart");
	}
	public void trackorder() {
		System.out.println("Tracking orders!!through flipcart");
	}

}
