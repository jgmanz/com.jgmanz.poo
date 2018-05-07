package models;

public class PantallaDatos extends Pantalla implements UserLog {
 
	@Override
	public void onMenuClick(int menu) {
		super.onMenuClick(menu);
	}
	
	
	@Override
	public void mover() {
		// TODO Auto-generated method stub

		System.out.println("mover datos");
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		System.out.println("Generar corte de datos");
		System.out.println("Cerrando datos");
	}

	@Override
	public void minimizar() {
		// TODO Auto-generated method stub

		System.out.println("minimizar datos");
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
