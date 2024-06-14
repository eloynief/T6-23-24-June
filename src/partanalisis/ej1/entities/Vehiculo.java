package partanalisis.ej1.entities;

public class Vehiculo implements Comparable<Vehiculo>{

	/*
	 * Atributos
	 */
	
	private String marca="";
	private String modelo="";
	private String color="";
	private String matricula="";
	//comprueba si el motor esta encendido
	private boolean encendido=false;
	private int marcha=0;
	private int velocidad=0;
	
	/*
	 * Constructores
	 */
	
	public Vehiculo(String marca, String modelo, String color, String matricula) {

		//comprobamos el parametro de marca
		if(marca!=null&&!marca.equals("")) {
			this.marca = marca;
		}

		//comprobamos el parametro del modelo
		if(modelo!=null&&!modelo.equals("")) {
			this.modelo = modelo;
		}

		//comprobamos el parametro del color
		if(color!=null&&!color.equals("")) {
			this.color = color;
		}
		
		//comprobamos el parametro de la matricula
		if(matricula!=null&&!matricula.equals("")) {
			this.matricula = matricula;
		}
		

		
	}
	
	
	/*
	 * Propiedades
	 */
	
	

	//getters
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public int getMarcha() {
		return marcha;
	}
	

	public int getVelocidad() {
		return velocidad;
	}

	
	//setters
	
	public void setColor(String color) {
		//comprobamos el parametro del color
		if(color!=null&&!color.equals("")) {
			this.color = color;
		}
		
	}
	
	/**
	 * set de velocidad
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		if(velocidad>=0) {
			this.velocidad = velocidad;
		}
	}
	
	
	@Override
	public boolean equals(Object o) {
		boolean comp=false;
		
		if(o instanceof Vehiculo) {
			Vehiculo man=(Vehiculo)o;
			comp=(man.modelo.equals(modelo));
		}
		//
		return comp;
	}
	
	


	@Override
	public String toString() {
		String str="";

		str+="Marca: "+marca+"\n";
		str+="Modelo: "+modelo+"\n";
		str+="Color: "+color+"\n";
		str+="Marricula: "+matricula+"\n";
		str+="Esta encendido?: "+(encendido?"Si":"No")+"\n";
		str+="Marcha: "+marcha+"\n";
		str+="Velocidad: "+velocidad+"\n";
		
		return str;
	}


	@Override
	public int compareTo(Vehiculo o) {
		
		//llamamos al compare to del otro
		int num=this.modelo.compareToIgnoreCase(o.modelo);
				
		return num;
	}
	
	

	/**
	 * metodo para parar el vehiculo
	 */
	public void pararVehiculo() {
		encendido=false;
	}
	
	/**
	 * metodo para encender el vehiculo
	 */
	public void encenderVehiculo() {
		encendido=true;
	}
	
	/**
	 * metodo para cambiar la marcha en funcion de la velocidad
	 */
	public void cambioMarcha() {
		if(velocidad>0&&velocidad<30) {
			marcha=1;
		}
		else if(velocidad>=30&&velocidad<50) {
			marcha=2;
		}
		else if(velocidad>=50&&velocidad<70) {
			marcha=3;
		}
		else if(velocidad>=70&&velocidad<100) {
			marcha=4;
		}
		else if(velocidad>=100) {
			marcha=5;
		}
		else if(velocidad==0) {
			marcha=0;
		}
		//caso extra mio propio
		//si la velocidad es <0 (es decir, esta retrocediendo)
		else {
			//la marcha se vuelve -1 (equivalente a R)
			marcha=-1;
		}
		
	}

	
}
