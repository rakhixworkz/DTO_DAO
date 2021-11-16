package com.xworkz.OnlineShopping.Dao;

public class Tester {

	public static void main(String[] args) {
		Myntra myntra=new Myntra();
		myntra.placeOrder();
		myntra.trackorder();
		myntra.viewOrder();
		FlipCart flipcart=new FlipCart();
		flipcart.placeOrder();
		flipcart.trackorder();
		flipcart.viewOrder();
		Amazon amazon=new Amazon();
		amazon.placeOrder();
		amazon.trackorder();
		amazon.viewOrder();
		
	}

}
