package proyecto1;

public class Auto {
	private String color;
	private Marca marca1;
	private Propietario propie;
	private int velocidadMaxima;
	private int velocidadActual;
	private int numeroDePuertas;
	private boolean tieneQuemacocos;
	private int numeroDeVelocidades;
	private boolean esAutomatico;
	private double volumenCombustible;
	
	public Auto(Propietario propie) {
		this.propie = propie;
	}
	
	public void visualizarVolumenCombustible() {
		System.out.println("El volumen de cobustible es: " + volumenCombustible);
	}
	
	public double calcularAutonomia(double consumoMedio) {
		return volumenCombustible * consumoMedio;
	}
	
	public void acelerar() {
		velocidadActual += 1;
	}
	
	public void frenar() {
		velocidadActual = 0;
	}
	
	public void usarReversa() {
		if (!(velocidadActual > 0)) {
			//SE PUEDE USAR REVERSA
		}
	}
	
	public void cambiarVelocidadArriba() {
		
	}
	
	public void cambiarVelocidadAbajo() {
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Marca getMarca() {
		return marca1;
	}
	
	public void setMarca(Marca marca1) {
		this.marca1 = marca1;
	}
	
	public Propietario getPropietario() {
		return propie;
	}
	
	public void setPropietario(Propietario propie) {
		this.propie = propie;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}
	
	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	
	public boolean isTieneQuemacocos() {
		return tieneQuemacocos;
	}
	
	public void setTieneQuemacocos(boolean tieneQuemacocos) {
		this.tieneQuemacocos = tieneQuemacocos;
	}
	
	public int getNumeroDeVelocidades() {
		return numeroDeVelocidades;
	}
	
	public void setNumeroDeVelocidades(int numeroDeVelocidades) {
		this.numeroDeVelocidades = numeroDeVelocidades;
	}
	
	public boolean isEsAutomatico() {
		return esAutomatico;
	}
	
	public void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}
	
	public double getVolumenCombustible() {
		return volumenCombustible;
	}
	
	public void setVolumenCombustible(double volumenCombustible) {
		this.volumenCombustible = volumenCombustible;
	}
}
