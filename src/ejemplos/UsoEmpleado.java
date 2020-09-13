package ejemplos;
import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado listaEmpleados[] = new Empleado[3]; listaEmpleados[0] = new
		 * Empleado("Ana", 45, 2000); listaEmpleados[1] = new Empleado("Antonio", 55,
		 * 2500); listaEmpleados[2] = new Empleado("Maria", 25, 2600);
		 */

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(); // en la api de java dice que se puede hasta 10
																		// valores.
		listaEmpleados.ensureCapacity(16); // método de java.util.ArrayList clase aumenta la capacidad de esta instancia
											// ArrayList, si es necesario,
											// para asegurar que puede contener al menos el número de elementos
											// especificados por el argumento de
											// capacidad mínima.
		listaEmpleados.add(new Empleado("Ana", 45, 2000));
		listaEmpleados.add(new Empleado("Antonio", 55, 2500));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 3200));
		listaEmpleados.add(new Empleado("Ana", 45, 2000));
		listaEmpleados.add(new Empleado("Antonio", 55, 2500));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 3200));
		listaEmpleados.add(new Empleado("Ana", 45, 2000));
		listaEmpleados.add(new Empleado("Antonio", 55, 2500));
		listaEmpleados.add(new Empleado("Mario", 25, 2600));
		listaEmpleados.add(new Empleado("Federico", 35, 3200));
		listaEmpleados.add(new Empleado("Fernando", 45, 2000));
		listaEmpleados.add(new Empleado("Dario", 55, 2500));
		listaEmpleados.add(new Empleado("Marianela", 25, 2600));
		listaEmpleados.add(new Empleado("Jorge", 35, 5200));
		listaEmpleados.trimToSize();
		// listaEmpleados.add(new Empleado("Olga", 39, 8200));
		// listaEmpleados.set(1, new Empleado("Olga", 39, 8200));
		// System.out.println(listaEmpleados.get(4).dameDatos());
		/*
		 * System.out.println(listaEmpleados){ for (Empleado e: listaEmpleados){
		 * System.out.println(e.dameDatos());
		 */

		Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
		while (mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().dameDatos());
		}

		/*
		 * for (int i=0;i<listaEmpleados.size();i++) { Empleado e=listaEmpleados.get(i);
		 * System.out.println(e.dameDatos());
		 * 
		 * }
		 */

		/*
		 * Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		 * listaEmpleados.toArray(arrayEmpleados); for(int
		 * i=0;i<arrayEmpleados.length;i++) {
		 * System.out.println(arrayEmpleados[i].dameDatos()); } }
		 * 
		 * }
		 */

	}
}

class Empleado {

	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;

	}

	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene " + edad + " años." + " Y un salario de " + salario;
	}

	private String nombre;
	private int edad;
	private double salario;

}
