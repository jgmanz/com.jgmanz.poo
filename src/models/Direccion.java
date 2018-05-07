package models;

public class Direccion {
	private String colonia; 
	private String calle; 
	private String mza; 
	private String lt; 
	private String municipio; 
	private String pais;
	private String cp;
	
	public Direccion()
	{
		
	}
	
	public Direccion(String colonia, String calle, String mza, String lt, String municipio, String pais, String cp) {
		this.colonia = colonia;
		this.calle = calle;
		this.mza = mza;
		this.lt = lt;
		this.municipio = municipio;
		this.pais = pais;
		this.cp = cp;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getMza() {
		return mza;
	}
	public void setMza(String mza) {
		this.mza = mza;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	} 
	
}
