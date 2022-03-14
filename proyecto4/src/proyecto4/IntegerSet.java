package proyecto4;

public class IntegerSet {
	private boolean elementos[];
	
	public IntegerSet() {
		elementos = new boolean[11];
	}
	
	public boolean getElement(int index) {
		return elementos[index];
	}
	
	public IntegerSet union(IntegerSet otroSet) {
		IntegerSet resultado = new IntegerSet();
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] || otroSet.getElement(i)) {
				resultado.insertarElemento(i);
			}
		}
		return resultado;
	}
	
	public IntegerSet interseccion(IntegerSet otroSet) {
		IntegerSet resultado = new IntegerSet();
		for (int i = 0; i < elementos.length; i++) {
			 if (elementos[i] && otroSet.getElement(i)) {
				 resultado.insertarElemento(i);
			 }
		}
		return resultado;
	}
	
	public void insertarElemento(int elemento) {
		this.elementos[elemento] = true;
	}
	
	public void deleteElemento(int elemento) {
		this.elementos[elemento] = false;
	}
	
	public String toSetString() {
		String resultado = "";
		boolean isEmpty = true;
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i]) {
				resultado += (i + " ");
				isEmpty = false;
			}
		}
		if (isEmpty) {
			resultado = "-";
		}
		return resultado;
	}
	
	public boolean equalTo(IntegerSet otroSet) {
		int i;
		for (i = 0; i < elementos.length; i++) {
			if (elementos[i] != otroSet.getElement(i)) {
				break;
			}
		}
		if (i < elementos.length) {
			return false;
		}
		else {
			return true;
		}
	}
}
