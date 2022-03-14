package proyecto3;

public class TestEmployee {

	public static void main(String[] args) {
		//se crean dos empleados
		Empleado empleado1 = new Empleado("Fulanito", "Detal", 10000.0);
		Empleado empleado2 = new Empleado("Perenganito", "Decual", 20000.0);
		
		System.out.println("El salario del empelado: " + empleado1.getNombre() + " " + empleado1.getApellido() + ", es de: " + empleado1.getSalario());
		System.out.println("El salario del empelado: " + empleado2.getNombre() + " " + empleado2.getApellido() + ", es de: " + empleado2.getSalario());
		
		//se hacen los aumentos respectivos de 10%
		empleado1.setSalario(empleado1.getSalario() * 1.10);
		empleado2.setSalario(empleado2.getSalario() * 1.10);
		//Se muestren los salarios despues de haber aplicado el aumento
		System.out.println("El salario del empelado: " + empleado1.getNombre() + " " + empleado1.getApellido() + ", es de: " + empleado1.getSalario());
		System.out.println("El salario del empelado: " + empleado2.getNombre() + " " + empleado2.getApellido() + ", es de: " + empleado2.getSalario());
		
		//Se muestre el numero de empleados
		System.out.println("Numero de empleados creados en el sistema: " + Empleado.cotnadorEmpleados);
	}
}
