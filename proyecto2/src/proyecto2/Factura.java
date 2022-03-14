package proyecto2;

public class Factura {
	private String numero;
	private String descripcion;
	private int cantidad;
	private double precio;
	
	public Factura(String numero, String descripcion, int cantidad, double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		if (precio < 0) {
			precio = 0;
		}
		this.precio = precio;
	}
	
	public double getTotalFactura() {
		double total = cantidad * precio;
		if (total < 0) {
			total = 0;
		}
		return total;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
