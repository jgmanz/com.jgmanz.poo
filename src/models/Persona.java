package models;

public class Persona {
	private String nombre; 
	private String apellidos; 
	private String email; 
	private String telefono; 
	private Direccion direccion;
	
	public Persona()
	{
		Direccion[] dirs = new Direccion[] {
				new Direccion()
		};
	} 
	
	public Persona(String nombre, String apellidos, String email, String telefono, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	} 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() { 
		return this.nombre + " "  +  this.apellidos; 
	}
	
	public void llamarPersona(String mensaje)
	{
		System.out.println("llamando persona...");
	}

	
	
}
