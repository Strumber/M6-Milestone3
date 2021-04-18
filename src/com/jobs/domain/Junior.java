package com.jobs.domain;

public class Junior extends Employee {

	protected double souBrut;
	protected IPaymentRate paymentRate;	

	//constructor
	public Junior(String name, String address, String phone, double souBrut,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, souBrut, paymentRate);		
		if (souBrut < 900 || souBrut > 1600)
			throw new Salary_err("El Junior ha de cobrar mes de 900 € i menys de 1.600€");
		if(paymentRate==null) throw new Exception();
				
		this.souBrut=souBrut;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
		return "Junior [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
				+"* Sou brut mensual="+ souBrut + ", Sou net mensual=" + totalPaid +"\n"
				+"* Sou brut anual= "+ souBrut*12 + ", Sou net Anual="+ totalPaid*12+"]"+"\n" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(souBrut);
	}

	

}
