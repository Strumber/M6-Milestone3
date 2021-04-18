package com.jobs.domain;

public class Boss extends Employee {

	protected double souBrut;
	protected IPaymentRate paymentRate;	

	//constructor
	public Boss(String name, String address, String phone, double souBrut,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, souBrut, paymentRate);		
		if(souBrut<8000) throw new Salary_err("El Salari del boss no pot ser inferior a 8.000 €");
		if(paymentRate==null) throw new Exception("el PaymentRate no pot ser nul");
				
		this.souBrut=souBrut;
		this.paymentRate=paymentRate;
	}
	
	
	

	//metodo toString
	@Override
	
		public String toString() {
			return "Boss [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
					+"* Sou brut mensual="+ souBrut + ", Sou net mensual=" + totalPaid +"\n"
					+"* Sou brut anual= "+ souBrut*12 + ", Sou net Anual="+ totalPaid*12+"]"+"\n" ;
		
	}

	//metodo pay
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(souBrut);
	}
	
		

}
