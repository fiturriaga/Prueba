package proyecto1;

public class Propietario {
	private String nombre;
	private String rfc;
	private String curp;
	private String fechaDeNacimiento;
	private Direccion dir;
	
	
	public Propietario(String nombre, String rfc, String curp, Direccion dir) {
		this.nombre = nombre;
		this.rfc = rfc;
		this.curp = curp;
		this.dir = dir;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public String getCurp() {
		return curp;
	}
	
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Direccion getDireccion() {
		return dir;
	}
	
	public void setDireccion(Direccion dir) {
		this.dir = dir;
	}
}
