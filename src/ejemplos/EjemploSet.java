package ejemplos;

import java.util.HashSet;       
import java.util.Set;          

public class EjemploSet {         
	public static void main(String[] args) {    

		Set<String> conjuntoDeFrutas = new HashSet<String>();  //Declaramos el objeto conjuntoDeFrutas que implementa la interfaz Set, y a continuación instanciamos el mismo objecto conjuntoDeFrutas que pertenece a la clase HashSet (siendo HashSet una clase que implementa Set)
		System.out.println("Mostraremos los integrantes de un conjunto de frutas.");
		conjuntoDeFrutas.add("manzana");
		conjuntoDeFrutas.add("pera");
		conjuntoDeFrutas.add("frutilla");
		conjuntoDeFrutas.add("naranja");

		for (String fruta : conjuntoDeFrutas) {
			System.out.println(fruta);
		}

		System.out.println("Ahora mostraremos los integrantes del mismo conjunto de frutas, pero sin la pera.");
		conjuntoDeFrutas.remove("pera");

		for (String fruta : conjuntoDeFrutas) {
			System.out.println(fruta);
		}
	}
}
