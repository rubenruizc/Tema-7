package boletin1.ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Creamos una lista donde introduciremos los números
		List<Integer> listOrdenada = new ArrayList<>();
		
		// Metemos los números en la lista
		for(int i = 1 ; i<= 10;i++) {
			listOrdenada.add(i);
		}
		
		// Imprimimos la lista ordenada
		System.out.println(listOrdenada.toString());
		
		// Desordenamos la lista
		Collections.shuffle(listOrdenada);
		
		// Imprimimos la lista desordenada
		System.out.println(listOrdenada.toString());
		

	}

}
