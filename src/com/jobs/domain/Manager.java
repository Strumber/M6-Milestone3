package com.jobs.domain;

public class Manager extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	// constructor
	public Manager(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		if (salaryPerMonth < 3500 || salaryPerMonth > 5000)
			throw new Salary_err("El Manager ha de cobrar mes de 3.000 i menys de 5.000€");
		if (paymentRate == null)
			throw new Exception();

		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}

	// metodo toString ??
	@Override

	public String toString() {
		return "Manager [name=" + name + ", address=" + address + ", phone=" + phone + " Salary Month=" + salaryPerMonth
				+ ", total Paid=" + totalPaid + "]";

	}

	// metodo pay
	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);
	}

}
