package com.jobs.domain;

public class Volunteer extends Employee {
	//protected double salaryPerMonth;
	//protected IPaymentRate paymentRate;	

	public Volunteer(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth > 0)
			throw new Salary_err("El voluntari pot tenir cap sou assignat");
		
	}

	
	/*public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(IPaymentRate paymentRate) {
		this.paymentRate = paymentRate;
	}*/

	@Override
	public void pay() {
			
	}
	//metodo to String
	@Override
	public String toString() {
		return "Volunteer [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
	}
	
	

}
