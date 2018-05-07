
import java.util.ArrayList;
import models.Cliente;
import models.Direccion;
import models.PantallaDatos;
import models.PantallaLogin;
import models.Persona;
//import models.Persona;
import models.User;

public class Start {
	
	public static void main (String [] args)
	{
		System.out.println("HOLA MUNDO"); 
		Persona p = new Persona();
		p.setNombre("Jose");
		p.setApellidos("Manzanero");
		Direccion dir = new Direccion("centro","calle 1","Mz10", "lt 7", "Solidaridad", "Mexico", "77710");
		Cliente c = new Cliente("Jose", "Manzanero", "jogal.manz@gmail.com","9841390123", dir, "PDC000125",
				"XAXACXA1000");
		c.setApellidos("Apellidos");
		System.out.println("Hola " + c.toString());		
		User u = new User();
		c.llamarPersona("");
		u.llamarPersona("");
		
		Object persona = new Persona();
		ArrayList<String > lss;
		
		
		/*
		
		
		Cliente c = new Cliente();
		ArrayList<Persona>ls = new ArrayList<Persona>();
		User u = new User();  
		ls.add(u);
		ls.add(c);
		
		u.llamarPersona("");
		c.llamarPersona("");
		
		System.out.println("Hola " + p.toString());
		System.out.println("Hola " + u.toString());
		
		
		PantallaLogin p1 = new PantallaLogin();
		PantallaDatos p2 = new PantallaDatos();
		p1.setTitulo("Acceso al sistema");
		p1.mover();
		p1.minimizar();
		p1.cerrar();
		
		p2.cerrar();
		*/
	}

}
