package com.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double souBrut;
	protected IPaymentRate paymentRate;	

	//constructor
	public Employee(String name, String address, String phone, double souBrut,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(souBrut<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.souBrut=souBrut;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + ", phone=" + phone + " Salary Month="+ souBrut + ", total Paid=" + totalPaid + "]" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(souBrut);
	}

	

}
