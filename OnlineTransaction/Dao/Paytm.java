package com.xworkz.OnlineTransaction.Dao;

public class Paytm implements OnlineTransactionOperationsDao{

	public void mobileRecharge() {
		System.out.println("Mobile recharge done successfully!! through Paytm");
	}

	public void electricityBillPayment() {
		System.out.println("Electricity bill paid successfully!!through Paytm");
	}
	public void creditCardPayment() {
		System.out.println("Credit card payment done successfully!!through Paytm");
	}

}
