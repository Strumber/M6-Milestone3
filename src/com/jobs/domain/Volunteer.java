package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		
	}

	//constructor de la Superclase
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
	
	}


	@Override
	public void pay() {
			
	}
	//metodo to String
	@Override
	public String toString() {
		return "Volunteer [name=" + name + ", address=" + address + ", phone=" + phone + "]" + " este es un voluntario ";
	}
	

}
