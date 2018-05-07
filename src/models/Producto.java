package models;

public class Producto {

	private String codigo;
	private String nombre;
	private float precio;
	private float costo;
	private Categoria categoria;
	public Producto(String codigo, String nombre, float precio, float costo, Categoria categoria) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.costo = costo;
		this.categoria = categoria;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
