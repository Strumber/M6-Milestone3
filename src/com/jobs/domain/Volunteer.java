package com.jobs.domain;

public class Volunteer extends Employee {
	protected double ajut;
		
	protected IPaymentRate paymentRate;	

	public Volunteer(String name, String address, String phone, double ajut, IPaymentRate iPaymentRate) throws Exception {
		super(name, address, phone, ajut,iPaymentRate);
		if (ajut > 300)
			throw new Salary_err("El voluntari no pot tenir un ajut superior al 300 €");
		
		this.ajut=ajut;
		
	}

	
	@Override
	public void pay() {
	
		
				
	}
	//metodo to String
	@Override
	public String toString() {
		return "Voluntari [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
				+"* Ajut governamental="+ ajut+"]"+"\n";
	}
	
	

}
