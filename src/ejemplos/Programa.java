package ejemplos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Programa {
	public static void main(String arg[]) {
		List<String> listaMarcasCoches = new ArrayList<String>(); // 
		
		listaMarcasCoches.add("Audi");
		listaMarcasCoches.add("Porsche");
		listaMarcasCoches.add("Aston Martin");
		listaMarcasCoches.add("Ferrari");
		listaMarcasCoches.add("Mercedes");
		listaMarcasCoches.add("Seat");
		System.out.println("N�mero elementos antes de eliminar: " + listaMarcasCoches.size());  //size= tama�o.
		System.out.println(listaMarcasCoches);
		listaMarcasCoches.remove("Seat");
		listaMarcasCoches.remove("Mercedes");
		System.out.println("N�mero elementos despu�s de eliminar Seat y Mercedes: " + listaMarcasCoches.size());
		System.out.println(listaMarcasCoches);
		System.out.println("El segundo elemento de la lista es: " + listaMarcasCoches.get(1));
		
	}
}
