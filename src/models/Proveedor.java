package models;

public class Proveedor  extends Persona{
	private String numCliente; 
	private String RFC;
	public Proveedor () {
		super();
	}
	public Proveedor(String nombre, String apellidos, String email, String telefono, Direccion direccion, 
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
	
	
	
}
