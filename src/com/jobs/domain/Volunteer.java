package com.jobs.domain;

public class Volunteer extends Employee {
	//protected double salaryPerMonth;
	//protected IPaymentRate paymentRate;	

	public Volunteer(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth > 0)
			throw new Salary_err("El voluntari pot tenir cap sou assignat");
		
	}

	
	@Override
	public void pay() {
			
	}
	//metodo to String
	@Override
	public String toString() {
		return "Volunteer [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
	}
	
	

}
