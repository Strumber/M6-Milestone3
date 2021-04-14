package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	//constructor
	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + " Salary Month="+ salaryPerMonth + ", total Paid=" + totalPaid + "]" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	

}
