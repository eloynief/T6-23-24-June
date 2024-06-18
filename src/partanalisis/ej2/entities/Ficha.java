package partanalisis.ej2.entities;

public abstract class Ficha implements Comparable<Ficha>{
	

    private int numId;
    private String titulo;
	
	

    public Ficha(int id, String titulo) {
        
    	if(id>=0) {
    		this.numId = id;
    	}
    	
        if(titulo!=null&&!titulo.equals("")) {
        	this.titulo = titulo;
        }
    }

    public int getId() {
        return numId;
    }

    public String getTitulo() {
        return titulo;
    }

	
	
	/*
	 * metodos abstractos
	 */
	
	abstract int prestamo();
	
	/**
	 * override de metodos
	 */
	
	

    @Override
    public String toString() {
    	String str="";
    	str+="ID: "+numId+"\n";
    	str+="Titulo: "+titulo+"\n";
    	
    	
        return str;
    }
	
	
	@Override
	public int compareTo(Ficha o) {
		//llamamos al compare to del otro
		int num=this.titulo.compareToIgnoreCase(o.titulo);
				
		return num;
		
	}
	
	
}

