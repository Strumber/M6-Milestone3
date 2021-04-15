package com.jobs.domain;

public class Boss extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	//constructor
	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
		if(salaryPerMonth<8000) throw new Salary_err("El Salari del boss no pot ser inferior a 8.000 €");
		if(paymentRate==null) throw new Exception("el PaymentRate no pot ser nul");
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Boss [name=" + name + ", address=" + address + ", phone=" + phone +" Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}
	
		

}
