package ejemplos;
import java.util.HashMap;
import java.util.Map;

public class MapaJava {

	public static void main(String[] args) {

		Map<String, Integer> mapa = new HashMap<String, Integer>();

		// Agregar elementos al mapa
		mapa.put("Carlos", 4443321);
		mapa.put("Gerardo", 4443322);
		mapa.put("Daniela", 4443323);
		mapa.put("Pedro", 4443324);

		// Mostrar el tamaño del mapa
		int tamano = mapa.size();
		System.out.println("Tamaño del mapa : " + tamano);

		// Obtener un elemento del mapa
		Integer telefono = mapa.get("Pedro");
		System.out.println("Telefono de Pedro : " + telefono);

		// Remover un elemento del mapa
		mapa.remove("Carlos");
		tamano = mapa.size();
		System.out.println("El tamaño del mapa despues de remover un elemento es: " + tamano);

		// Determinar si hay elementos en el mapa
		boolean estaVacio = mapa.isEmpty();
		System.out.println("¿Esta vacio el mapa?  " + ((estaVacio) ? "Si" : "No"));

		// Vaciar el mapa
		mapa.clear();
		tamano = mapa.size();
		System.out.println("Tamaño del mapa despues del vaciado: " + tamano);
	}

}
