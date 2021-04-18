package com.jobs.application;

import java.util.List;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;

	public JobsController() {

		repository = new EmployeeRepository();

	}

	public void createBossEmployee(String name, String address, String phone, double souBrut) throws Exception {
		try {
			Boss boss = new Boss(name, address, phone, souBrut, PaymentFactory.createPaymentRateBoss());

			repository.addMember(boss);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void createEmployee(String name, String address, String phone, double souBrut) throws Exception {
		Employee employee = new Employee(name, address, phone, souBrut,
				PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	
	public void createManagerEmployee(String name, String address, String phone, double souBrut)	throws Exception {
		try {
		Manager manager = new Manager(name, address, phone, souBrut, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void createVolunteer(String name, String address, String phone,double ajut) throws Exception {
		try {
		Volunteer volunteer = new Volunteer(name, address, phone, ajut,PaymentFactory.createPaymentRateVolunteer());
		repository.addMember(volunteer);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void createSeniorEmployee(String name, String address, String phone, double souBrut)
			throws Exception {
		try {
		Senior senior = new Senior(name, address, phone, souBrut, PaymentFactory.createPaymentRateSenior());
		repository.addMember(senior);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void createMidEmployee(String name, String address, String phone, double souBrut) throws Exception {
		try {
		Mid mid = new Mid(name, address, phone, souBrut, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void createJuniorEmployee(String name, String address, String phone, double souBrut)
			throws Exception {
		try {
		Junior junior = new Junior(name, address, phone, souBrut, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void payAllEmployeers() {
		List<AbsStaffMember> staffMembers = repository.getAllMembers();
		for (AbsStaffMember member : staffMembers) {
			member.pay();
		}

	}

	public String getAllEmployees() {
		List<AbsStaffMember> staffMembers = repository.getAllMembers();
		String members = "\n";
		for (AbsStaffMember member : staffMembers) {
			members = members + member.toString() + "\n";
		}

		return members;
	}

}
