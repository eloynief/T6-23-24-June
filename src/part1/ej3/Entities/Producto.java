package part1.ej3.Entities;


public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Constructors
    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // equals method based on nombre
    @Override
    public boolean equals(Object obj) {
    	boolean comp;
        Producto producto = (Producto) obj;
        
    	comp=this.nombre.equalsIgnoreCase(producto.nombre);
    	
        return comp;
    }

    // compareTo method
    @Override
    public int compareTo(Producto prod) {
        return this.nombre.compareToIgnoreCase(prod.nombre);
    }

    // calcular method
    public double calcular(double cantProductos) {
        return this.precio * cantProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}