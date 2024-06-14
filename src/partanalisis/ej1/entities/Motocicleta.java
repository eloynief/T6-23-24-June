package partanalisis.ej1.entities;

public class Motocicleta extends Vehiculo{

	
	private int cilindrada;
	private boolean carnet;
	

	public Motocicleta(String marca, String modelo, String color, String matricula,int cilindrada, boolean carnet) {
		super(marca, modelo, color, matricula);

		this.carnet=carnet;

		if(cilindrada<125){
			this.cilindrada=cilindrada;
		}
		else if(cilindrada>=125&&carnet) {
			this.cilindrada=cilindrada;
		}
		
	}

	/*
	 * propiedades
	 */

	public int getCilindrada() {
		return cilindrada;
	}


	public boolean isCarnet() {
		return carnet;
	}

	@Override
	public String toString() {		
		String str=super.toString();
		
		str+="Cilindrada: "+cilindrada+"\n";
		str+="Requiere carnet?: "+(carnet?"Si":"No")+"\n";
		
		return str;
	}
	
	
	
	
	
	
	
	
	
}
