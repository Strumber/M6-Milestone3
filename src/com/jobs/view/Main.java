package com.jobs.view;

import com.jobs.application.JobsController;

/*Fase 3
Fes una modificació als models, aquest han de tenir sou net y brut mensual, sou net y brut anual.
El sou net s’ha d’autocalcular al restar el % d’IRPF del sou brut.
Boss: 32%
Manager: 26%
Senior: 24%
Mid: 15% Junior: 2%
El voluntari pot tenir un ajut governamental podent cobrar fins a 300€ però s'ha d'indicar que és un ajut.
Has de crear una funció que permeti emetre un bonus a tota la plantilla. Aquest bonus és un 10% del sou anual de cada empleat. 
Els volunteers no reben aquest bonus.
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
