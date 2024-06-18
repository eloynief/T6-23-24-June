package part1.ej3.Entities;

class Perecedero extends Producto {
	
	/*
	 * atributo de dias
	 */
    private int dias;

    
    public Perecedero(String nombre, double precio, int dias) {
        super(nombre, precio);
        this.dias = dias;
    }
    
    //propiedades (getters/setters)
    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public double calcular(double cantProductos) {
        double precioFinal = getPrecio();
        
        
        
        if (dias == 3) {
            precioFinal /= 2;
        } else if (dias == 2) {
            precioFinal /= 3;
        } else if (dias == 1) {
            precioFinal /= 4;
        }
        return precioFinal * cantProductos;
    }

    @Override
    public String toString() {
    	String str=super.toString()+"\n";
    	str+="Dias: "+dias+"\n";
    	
        return str;
    }
}