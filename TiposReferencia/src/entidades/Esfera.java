package entidades;

public class Esfera {
	private float raio;
	
	public Esfera() {
		
	}

	public Esfera(float raio) {
		super();
		this.raio = raio;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float calcularVolume() {
		float resultado = (float)((4.0 / 3.0) * 3.14 * Math.pow(raio, 3));
		return resultado;
	}
	
	public float calcularArea() {
		float resultado = (float)(4 * 3.14 * Math.pow(raio, 2));
		return resultado;
	}
}
