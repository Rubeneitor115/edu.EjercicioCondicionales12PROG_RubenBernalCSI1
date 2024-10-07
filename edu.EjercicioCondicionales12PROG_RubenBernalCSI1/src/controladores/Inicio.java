/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero1, numero2;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito por consola los dos números al usuario y los guardo en sus variables
		System.out.println("Escriba el primer número entero: ");
		numero1 = sc.nextInt();
		System.out.println("Escriba el segundo número entero: ");
		numero2 = sc.nextInt();
		
		//Ordeno los dos número de forma decreciente
		if(numero1 > numero2) {
			System.out.println("Orden decreciente: " + numero1 + ", " + numero2);
		}else {
			System.out.println("Orden decreciente: " + numero2 + ", " + numero1);
		}

	}

}