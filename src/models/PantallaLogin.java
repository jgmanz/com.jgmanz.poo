package models;

public class PantallaLogin extends Pantalla{

	

	
	@Override
	public void cerrar() {
		System.out.println("Cerrando login");
	}

	@Override
	public void minimizar() {
		System.out.println("Minimizando login");
	}

	@Override
	public void mover() { 
		System.out.println("Moviendo login");
		
	}

}
