package proyecto2;

public class TestFatura {

	public static void main(String[] args) {
		Factura f1 = new Factura("1234", "producto 1", 10, 15.0);
		//Prueba el metodo total factura que regresa un double
		System.out.println("El total de la factura 1 es: " + f1.getTotalFactura());

		Factura f2 = new Factura("9876", "producto 2", -5, 10.12);
		//Prueba que si el total es menor que cero, se establece como cero
		System.out.println("El precio de la factura 2 es: " + f2.getTotalFactura());
		
		Factura f3 = new Factura("5678", "producto 3", 5, -10.123);
		//Prueba que el precio de un articulo no sea mayor que 0
		System.out.println("El precio de producto 3 es: " + f3.getPrecio());
	}

}
