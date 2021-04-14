package com.jobs.domain;

public class Mid extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	//constructor
	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Mid [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
		//return "Employee [salaryPerMonth=" + salaryPerMonth + ", paymentRate=" + paymentRate + ", name=" + name
		//		+ ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid + "]";
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	

}
