package proyecto1;

public class ClasePrueba {

	public static void main(String[] args) {
		Direccion dir1 = new Direccion("Avenida siempreviva", "Lomas del bosque", "12345", "No hay complemento");
		Propietario owner1 = new Propietario("Homero Simpson", "HJSP80124567AB3", "HJSP80124567HMTRK02", dir1);
		Marca marca1 = new Marca();
		marca1.setModelo("2022");
		marca1.setChasis("123ABCD456789XYZ");
		marca1.setModelo("El mas nuevo");
		Auto car1 = new Auto(owner1);
	}

}
