package models;

public abstract class Pantalla {
	
	private String titulo; 
	private float x; 
	private float y;
	public Pantalla()
	{
		
	}
	public Pantalla(String titulo)
	{
		this.titulo = titulo; 
		this.x = 0; 
		this.y = 0; 
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	} 
	
	public void onMenuClick(int menu)
	{
		System.out.println("Abrir menu " + menu);
	}
	
	public abstract void mover(); 
	public abstract void cerrar(); 
	public abstract void minimizar(); 

}
