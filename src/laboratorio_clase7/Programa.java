package laboratorio_clase7;

import java.util.*;

public class Programa {

	public static void main(String[] args) {
		/*
		 * Introducción a Java Ejercicio 1 Crear un programa que ingrese una oración que
		 * realice las siguientes operaciones: 1. Contar las palabras. 2. Indicar si hay
		 * palabras repetidas. 3. Ordenar las palabras de forma ascendente y mostrar el
		 * resultado. 4. Ordenar las letras y mostrar el resultado
		 */

		Scanner teclado = new Scanner(System.in);
		String oracion;
		char[] letras;
		String[] palabras;
		int contador = 0;
		int contadorPalabrasRepetidas = 0;

		do {
			System.out.println("Ingrese una oración : ");
			oracion = teclado.nextLine();
		} while (oracion.length() == 0);

		palabras = oracion.split(" ");
		contador = palabras.length;

		System.out.println("La cantidad de palabras que contiene esta oración es : " + contador);

		Arrays.sort(palabras);

		System.out.println("Las palabras ordenadas: ");
		System.out.println(Arrays.toString(palabras));
//			 for(int i=0; i< palabras.length;i++)
//			 {
//				 System.out.println(palabras[i]);
//			 }

		for (int i = 0; i < palabras.length - 1; i++) {
			if (palabras[i].equals(palabras[i + 1])) {
				contadorPalabrasRepetidas++;
				System.out.println(palabras[i] + " esta repetida");
			}
		}
		if (contadorPalabrasRepetidas == 0) {
			System.out.println("No hay palabras repetidas.");
		} else {
			System.out.println("\nHay " + contadorPalabrasRepetidas + " palabras repetidas");
		}

		oracion = oracion.replace(" ", "");
		System.out.println("\nOracion sin espacios : " + oracion);
		letras = oracion.toCharArray();
		Arrays.sort(letras);

		System.out.println("Letras Ordenadas: ");
		System.out.println(Arrays.toString(letras));
//			for(int i=0; i< letras.length;i++)
//			 {
//				 System.out.println(letras[i]);
//			 }

		teclado.close();
	}

}
