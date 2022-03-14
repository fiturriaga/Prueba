package proyecto4;

public class ClasePrueba {

	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		
		//Prueba que despliega un conjunto vacio
		System.out.println("Contenido del set: " + set1.toSetString());
		
		set1.insertarElemento(0);
		set1.insertarElemento(1);
		set1.insertarElemento(2);
		set1.insertarElemento(3);
		set1.insertarElemento(4);
		set1.insertarElemento(5);
		set1.insertarElemento(6);
		set1.insertarElemento(7);
		set1.insertarElemento(8);
		set1.insertarElemento(9);
		//Pruba de insersion de 10 elementos
		System.out.println("Contenido del set 1: " + set1.toSetString());
		
		set1.deleteElemento(0);
		set1.deleteElemento(1);
		set1.deleteElemento(2);
		set1.deleteElemento(3);
		set1.deleteElemento(4);
		//Pruba de insersion de 10 elementos
		System.out.println("Contenido del set 1: " + set1.toSetString());
		
		IntegerSet set2 = new IntegerSet();
		set2.insertarElemento(0);
		set2.insertarElemento(1);
		set2.insertarElemento(2);
		set2.insertarElemento(3);
		set2.insertarElemento(4);
		
		IntegerSet set3 = set1.union(set2);
		//Pruba de union de 10 elementos, 5 set1 y 5 set2
		System.out.println("Contenido del unido 3: " + set3.toSetString());
		
		//Prueba de interseccion de elmentos de set1 y set3
		IntegerSet set4 = set1.interseccion(set3);
		System.out.println("Contenido del unido 4: " + set4.toSetString());
		
		//Pruebas para determinar igualdad entre sets
		System.out.println("El set 1 es igual al set 4: " + set4.equalTo(set1));
		System.out.println("El set 1 es igual al set 2: " + set1.equalTo(set2));
	}

}
