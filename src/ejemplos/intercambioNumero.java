package ejemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class intercambioNumero {

	public static void introducirValores(List<Integer> listaDeNumerosEnteros) {  

		Scanner teclado = new Scanner(System.in);
		Integer numero;

		System.out.println("Introduce un numero entero: ");

		do {

			numero = teclado.nextInt();

			listaDeNumerosEnteros.add(numero);

			System.out.println("Introduce otro numero entero y si quieres salir introduce uno negativo");

		} while (numero >= 0);

		for (int i = 0; i < listaDeNumerosEnteros.size(); i++) {

			if (listaDeNumerosEnteros.get(i) < 0) {

				listaDeNumerosEnteros.remove(i);

			}

		}

	}

	public static void mostrarLista(List<Integer> listaNumeros) {
		System.out.println("La lista contiene los siguientes numeros");
		System.out.println(listaNumeros);
	}

	public static void intercambiarPosiciones(List<Integer> listaNumeros) {

		Integer aux;   // clase Integer guarda enteros

		aux = listaNumeros.get(1);       //variable aux
		listaNumeros.set(1, listaNumeros.get(3));
		listaNumeros.set(3, aux);

	}

	public static void main(String[] args) {

		List<Integer> listaNumeros = new ArrayList<Integer>();
		introducirValores(listaNumeros);
		mostrarLista(listaNumeros);
		intercambiarPosiciones(listaNumeros);
		mostrarLista(listaNumeros);
	}

}

