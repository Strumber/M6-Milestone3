package com.jobs.view;

import com.jobs.application.JobsController;

/*Fase 2
Modifica el programa perquè existeixin 3 tipus d'empleats. Junior, Mid i Senior. Han d'heretar d'empleats. Aquests empleats tenen una reducció del: 15, 10 i 5% de sou respectivament respecte a la base. 
Afegeix una validació de sous al introduir-los (utilitza excepcions): 
Boss: Ha de cobrar més de 8000€ 
Manager: Ha de cobrar més de 3000 però menys de 5000€ 
Senior: Ha de cobrar més de 2700 pero menys de 4000€ 
Mid: Ha de cobrar més de 1800 pero menys de 2500€ 
Junior: Ha de cobrar més de 900 pero menys de 1600€ 
Volunteer: S'ha de validar que no cobra.
*/ 

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direccion molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direccion molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666");
		controller.createManagerEmployee("Pedro Employee", "Direccion molona 2", "665226666", 80.0);
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: " + allEmployees + " \n");
		
	}

}
