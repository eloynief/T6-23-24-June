package partanalisis.ej1.entities;

public class Camion extends Vehiculo{
	
	private double pesoMaximo=0;
	private boolean peligroso=false;
	
	

	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximo, boolean peligroso) {
		super(marca, modelo, color, matricula);
		
		if(pesoMaximo>=0) {
			this.pesoMaximo = pesoMaximo;
		}
		
		this.peligroso = peligroso;
	}



	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public boolean isPeligroso() {
		return peligroso;
	}



	@Override
	public String toString() {
		String str = super.toString();
		
		str+="Peso Maximo: "+pesoMaximo+"\n";
		str+="Es peligroso?: "+(peligroso?"Si":"No")+"\n";
		
		return str;
		
		
	}
	
	
	
	
	
	
}
