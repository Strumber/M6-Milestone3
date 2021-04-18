package com.jobs.domain;

public class Manager extends Employee {

	protected double souBrut;
	protected IPaymentRate paymentRate;

	// constructor
	public Manager(String name, String address, String phone, double souBrut, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, souBrut, paymentRate);
		if (souBrut < 3500 || souBrut > 5000)
			throw new Salary_err("El Manager ha de cobrar mes de 3.000 i menys de 5.000€");
		if (paymentRate == null)
			throw new Exception();

		this.souBrut = souBrut;
		this.paymentRate = paymentRate;
	}

	// metodo toString ??
	@Override

	public String toString() {
		return "Manager [Nom=" + name + ", Adreça=" + address + ", Telèfon=" + phone +"\n"
				+"* Sou brut mensual="+ souBrut + ", Sou net mensual=" + totalPaid +"\n"
				+"* Sou brut anual= "+ souBrut*12 + ", Sou net Anual="+ totalPaid*12+"]"+"\n" ;
	}

	// metodo pay
	@Override
	public void pay() {
		totalPaid = paymentRate.pay(souBrut);
	}

}
