package part1.ej2;

public class Empleado {
	
	private String nombre;

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}



	@Override
	public String toString() {
		String str="";
		str+="Empleado: "+nombre;
		return str;
	}
	
	
	
	
	
	
	
}
