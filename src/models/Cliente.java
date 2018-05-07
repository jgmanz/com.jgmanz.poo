package models;

public class Cliente extends Persona{

	
	private String numCliente; 
	private String RFC;
	public Cliente() { 
		
	}
	public Cliente(String nombre, String apellidos, String email, String telefono, Direccion direccion, 
			String numCliente, String RFC) {
		super(nombre, apellidos, email, telefono, direccion);
		this.numCliente = numCliente; 
		this.RFC = RFC; 
	}
	
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	
	@Override
	public void llamarPersona(String mensaje) { 
		//super.llamarPersona(mensaje);
		System.out.println("Ofrecer productos");
	}
}
