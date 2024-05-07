package boletin1.ejercicio05;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Mapa que almacena las series
		HashMap<String, String> serie = new HashMap<>();
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la opción del usuario
		int opcion;

		// Variable donde guardaremos el nombre de la serie
		String nombre;
		
		// Variable donde guardaremos el valor que le da el usuario a la película
		String valor;

		// Bucle para ir preguntandole las opciones al usuario en base a la opcion seleccionada
		do {
			menu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				System.out.println("Añada una valoración");
				valor = sc.nextLine();
				serie.put(nombre, valor);
				System.out.println("Añadido correctamente");
				break;

			case 2:
				System.out.println("Busca una serie");
				nombre = sc.nextLine();
				if (serie.containsKey(nombre)) {
					System.out.println(nombre + ":" + serie.get(nombre));
				} else {
					System.out.println("No existe");
				}
				break;
			case 3:
				System.out.println("Eliminar una serie");
				nombre = sc.nextLine();
				if (serie.remove(nombre) != null) {
					System.out.println("Eliminado correctamente");
				} else {
					System.out.println("No existe");
				}
				break;
			case 4:
				System.out.println("Saliendo del programa");
				break;

			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 4);
		
		// Cierre del Scanner
		sc.close();
	}

	// Método para desplegar el menú de opciones
	public static void menu() {
		System.out.println("Gestión de series");
		System.out.println("1.Agregar");
		System.out.println("2.Buscar");
		System.out.println("3.Eliminar");
		System.out.println("4.Salir");
		System.out.println("Seleccione una opcion: ");
	}

}
