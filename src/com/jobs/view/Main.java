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
		
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 8050.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666",100.0);
		controller.createManagerEmployee("Pedro Manger", "Direccion molona 2", "665226666", 3500.0);
		controller.createSeniorEmployee("Maria Senior", "Direccion molona 6", "665226666", 2700.0);
		controller.createMidEmployee("Pepe Mid", "Direccion molona 7", "665226666", 2000.0);
		controller.createJuniorEmployee("Pepa Junior", "Direccion molona 8", "665226666", 100.0);
		
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("Relació Empleats: " + allEmployees + " \n");
		
	}

}
