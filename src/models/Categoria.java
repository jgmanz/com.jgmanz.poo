package models;

public class Categoria {
	private String nombre;
	private String clave;
	
	public Categoria(String nombre, String clave) { 
		this.nombre = nombre;
		this.clave = clave;
	}
	
	private Categoria()
	{
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
