package boletin1.ejercicio02;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Variable donde se almacenara el número generado
		int num;

		// Lista donde se almacenaran los números generados
		Set<Integer> listNum = new LinkedHashSet<>();

		// Generador de un número random
		Random r = new Random();

		// Bucle para que mientras la longitud de la lista no sea 10 que siga añadiendo números
		while (listNum.size() < 10) {

			num = r.nextInt(20) + 1;

			listNum.add(num);

		}

		// Imprimimos la lista
		System.out.println(listNum);
	}

}
