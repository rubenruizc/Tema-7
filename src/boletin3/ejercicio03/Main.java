package boletin3.ejercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//Constante que contiene el texto
		final String TEXTO = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// Variable que almacena el número de apariciones de una letra
		int apariciones = 1;

		//
		char[] textArray = TEXTO.toLowerCase().toCharArray();

		// Mapa que almacena las letras y el número de sus apariciones
		Map<Character, Integer> frecuencia = new HashMap<>();

		// Bucle para recorrer el array e inserta el caracter en la lista si es una letra
		for (char b : textArray) {
			if (Character.isLetter(b)) {
				if (frecuencia.containsKey(b)) {
					apariciones = frecuencia.get(b) + 1;
				}
				frecuencia.put(b, apariciones);
			}
		}

		// Imprimimos las apariciones de cada key y cada value
		frecuencia.forEach((k, v) -> System.out.println("Letra: " + k + "-->" + v + " apariciones"));
	}

}
