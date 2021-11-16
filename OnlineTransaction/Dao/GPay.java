package com.xworkz.OnlineTransaction.Dao;

public class GPay implements OnlineTransactionOperationsDao {

	public void mobileRecharge() {
		System.out.println("Mobile recharge done successfully!! through Google pay");
	}

	public void electricityBillPayment() {
		System.out.println("Electricity bill paid successfully!!through Google pay");
	}
	public void creditCardPayment() {
		System.out.println("Credit card payment done successfully!!through Google pay");
	}

}
