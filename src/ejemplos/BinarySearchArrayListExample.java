package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchArrayListExample {
	public static void main(String args[]) {

		List lista = new ArrayList<>();

// Inserta elementos a la lista

		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("cuatro");
		lista.add("cinco");
		lista.add("seis");
		lista.add("siete");

		Collections.sort(lista); // Ordenacion
		System.out.println("Lista ordenada: " + lista);

// Busqueda de un elemento en la lista
		int indice = Collections.binarySearch(lista, "cinco");
		System.out.println("Elemento encontrado en posicion " + indice);

// Busqueda de un elemento que no esta en la lista
		indice = Collections.binarySearch(lista, "ocho");
		System.out.println("No encontrado " + indice);
	}
}