package ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchArrayListExample {
	public static void main(String args[]) {
		
		ArrayList arrayList = new ArrayList<>();

// inserta elementos
		
		arrayList.add("uno");
		arrayList.add("dos");
		arrayList.add("tres");
		arrayList.add("cuatro");
		arrayList.add("cinco");
		arrayList.add("seis");
		arrayList.add("siete");
		
		
		Collections.sort(arrayList); // Ordenacion
		System.out.println("Lista ordenada: " + arrayList);

// Busqueda de elemento en la lista
		int index = Collections.binarySearch(arrayList, "cinco");
		System.out.println("Elemento encontrado en posicion " + index);

// Busqueda de elemento no en la lista
		index = Collections.binarySearch(arrayList, "ocho");
		System.out.println("No encontrado " + index);
	}
}