package models;

public class User extends Persona implements UserLog {
	
	private String username;
	private String password;
	
	public User()
	{
		
	} 
	
	public User(String nombre, String apellidos, String email, String telefono, Direccion direccion, String username, String password) {
		super(nombre, apellidos, email, telefono, direccion);
		this.username = username; 
		this.password = password; 
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void llamarPersona(String mensaje) { 
		super.llamarPersona(mensaje);
		System.out.println("Preguntar avances de proyecto");
	}
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changepassword() {
		// TODO Auto-generated method stub
		
	}

	 
	
	
}
