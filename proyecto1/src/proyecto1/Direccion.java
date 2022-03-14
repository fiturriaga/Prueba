package proyecto1;

public class Direccion {
	private String calle;
	private String colonia;
	private String codigoPostal;
	private String complemento;

	public Direccion(String calle, String colonia, String codigoPostal, String complemento) {
		this.calle = calle;
		this.colonia = colonia;
		this.codigoPostal = codigoPostal;
		this.complemento = complemento; 
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getColonia() {
		return colonia;
	}
	
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
