package com.jobs.domain;

public class Senior extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	//constructor
	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if (salaryPerMonth < 2700 || salaryPerMonth > 4000)
			throw new Salary_err("El Senior ha de cobrar mes de 2.700 i menys de 4.000€");
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Senior [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	

}
