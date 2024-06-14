package partanalisis.ej1.view;

import partanalisis.ej1.entities.Camion;
import partanalisis.ej1.entities.Vehiculo;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo[] vehiculos=new Vehiculo[2];
		
		vehiculos[0]=new Vehiculo("Marca", "Modelo5", "Blanco", "1234abc");

		vehiculos[1]=new Camion("Marca Camion", "ModeloCamion-1", "Negro", "6204iet", 2000, true);

		vehiculos[0].setVelocidad(80);
		vehiculos[1].setVelocidad(80);

		for(Vehiculo vehiculo:vehiculos) {
			System.out.println("Antes del cambio de marcha y de comprobar el gato");
			System.out.println(vehiculo);
		}
		
		if(pasaGato()) {
			System.out.println("El gato esta pasando");
			//se para el vehiculo
			vehiculos[0].setVelocidad(0);
			vehiculos[1].setVelocidad(0);
		}
		else {
			System.out.println("El gato no esta pasando");
		}
		
		//se cambia la marcha
		vehiculos[0].cambioMarcha();
		vehiculos[1].cambioMarcha();
		
		
		for(Vehiculo vehiculo:vehiculos) {
			System.out.println("Despues del cambio de marcha");
			System.out.println(vehiculo);
		}
		
	}
	
	/**
	 * funcion para comprobar si el gato esta en la carretera
	 * @return
	 */
	public static boolean pasaGato() {
		int random=(int)(Math.random()*101);
		
		//se comprueba y se devuelve el resultado
		boolean comp=(random<=10);
		return comp;
	}

}
