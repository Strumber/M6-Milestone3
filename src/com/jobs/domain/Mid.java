package com.jobs.domain;

public class Mid extends Employee {

	protected double souBrut;
	protected IPaymentRate paymentRate;	

	//constructor
	public Mid(String name, String address, String phone, double souBrut,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, souBrut, paymentRate);		
		if (souBrut < 1800 || souBrut > 2500)
			throw new Salary_err("El Mid ha de cobrar mes de 1.800 € i menys de 2.500€");
		if(paymentRate==null) throw new Exception();
				
		this.souBrut=souBrut;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString ??
	@Override
	
		public String toString() {
		return "Mid [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
				+"* Sou brut mensual="+ souBrut + ", Sou net mensual=" + totalPaid +"\n"
				+"* Sou brut anual= "+ souBrut*12 + ", Sou net Anual="+ totalPaid*12+"]"+"\n" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(souBrut);
	}

	

}
