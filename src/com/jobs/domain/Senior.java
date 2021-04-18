package com.jobs.domain;

public class Senior extends Employee {

	protected double souBrut;
	protected IPaymentRate paymentRate;	

	//constructor
	public Senior(String name, String address, String phone, double souBrut,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, souBrut, paymentRate);		
		if (souBrut < 2700 || souBrut > 4000)
			throw new Salary_err("El Senior ha de cobrar mes de 2.700 i menys de 4.000€");
		if(paymentRate==null) throw new Exception();
				
		this.souBrut=souBrut;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
		return "Senior [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
				+"* Sou brut mensual="+ souBrut + ", Sou net mensual=" + totalPaid +"\n"
				+"* Sou brut anual= "+ souBrut*12 + ", Sou net Anual="+ totalPaid*12+"]"+"\n" ;
	
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(souBrut);
	}

	

}
