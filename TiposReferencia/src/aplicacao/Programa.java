package aplicacao;

import entidades.Esfera;

public class Programa {

	public static void main(String[] args) {
		Esfera esfera = new Esfera(4);
		
		float area = esfera.calcularArea();
		float volume = esfera.calcularVolume();
		
		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
	}

}
