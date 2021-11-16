package com.xworkz.OnlineTransaction.Dao;

public class Tester {

	public static void main(String[] args) {
		PhonePay phonePay=new PhonePay();
		phonePay.electricityBillPayment();
		phonePay.mobileRecharge();
		phonePay.creditCardPayment();
		GPay gPay=new GPay();
		gPay.mobileRecharge();
		gPay.creditCardPayment();
		gPay.electricityBillPayment();
		
	}

}
