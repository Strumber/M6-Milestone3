package com.jobs.domain;

public class Junior extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	//constructor
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if (salaryPerMonth < 900 || salaryPerMonth > 1600)
			throw new Salary_err("El Junior ha de cobrar mes de 900 € i menys de 1.600€");
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Junior [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	

}
