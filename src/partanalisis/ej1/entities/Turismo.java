package partanalisis.ej1.entities;

public class Turismo extends Vehiculo{
	
	private enum Uso{PROFESIONAL,PARTICULAR}
	
	private int plazas;
	private Uso tipoUso;
	

	public Turismo(String marca, String modelo, String color, String matricula,int plazas,String tipoUso) {
		super(marca, modelo, color, matricula);
		
		if(plazas>0) {
			this.plazas=plazas;
		}
		
		if(tipoUso!=null&&!tipoUso.equals("")) {
			this.tipoUso=Uso.valueOf(tipoUso);
		}
		
		
	}

	/*
	 * Propiedades
	 */
	
	//getters
	/**
	 * 
	 * @return el tipo de uso pero en string
	 */
	public String getTipoUso() {
		return tipoUso.toString();
	}



	public int getPlazas() {
		return plazas;
	}
	
	//setters

	
	public void setTipoUso(String tipoUso) {
		if(tipoUso!=null&&!tipoUso.equals("")) {
			this.tipoUso=Uso.valueOf(tipoUso);
		}
	}

	
	@Override
	public String toString() {
		String str=super.toString();
		
		str+="Plazas: "+plazas+"\n";
		str+="Tipo de uso: "+tipoUso.toString()+"\n";
		
		return str;
	}

	
	
	
	
	
	
}
