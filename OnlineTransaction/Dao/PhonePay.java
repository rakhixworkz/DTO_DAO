package com.xworkz.OnlineTransaction.Dao;

public class PhonePay implements OnlineTransactionOperationsDao {

	public void mobileRecharge() {
		System.out.println("Mobile recharge done successfully!! through Phonepay");
	}

	public void electricityBillPayment() {
		System.out.println("Electricity bill paid successfully!!through Phonepay");
	}

	public void creditCardPayment() {
		System.out.println("Credit card payment done successfully!!through Phonepay");
	}

}
