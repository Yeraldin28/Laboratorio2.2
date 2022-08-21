

package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto2 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CALCULA OPERACIONES B�SICAS CON N�MEROS BINARIOS\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si volver a usar el programa
		int repetir;

		do {
			// Declaraci�n de las variables
			int numero1, numero2, resultado = 0, operacion;

			// Se le pide al usuario que elija la operaci�n a realizar
			System.out.print("\n\t�Qu� operaci�n deseas realizar? \n" + "\n\t1. Suma " + "\n\t2. Resta "
					+ "\n\t3. Multiplicaci�n " + "\n\t4. Divisi�n" + "\n\n\tDecisi�n: ");
			operacion = Integer.parseInt(in.readLine());

			// Se comprueba que la opci�n este bien elegida
			if (operacion < 1 || operacion > 4) {
				while (operacion < 1 || operacion > 4) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					operacion = Integer.parseInt(in.readLine());
				}
			}

			// Se le pide el n�mero al usuario
			System.out.print("\n\tEscribe el primer n�mero: ");
			numero1 = Integer.parseInt(in.readLine(), 2);
			System.out.print("\n\tEscribe el segundo n�mero: ");
			numero2 = Integer.parseInt(in.readLine(), 2);

			// Se realiza la operaci�n escogida entre los dos n�meros
			switch (operacion) {
			case 1:
				resultado = numero1 + numero2;
				break;
			case 2:
				resultado = numero1 - numero2;
				break;
			case 3:
				resultado = numero1 * numero2;
				break;
			case 4:
				resultado = numero1 / numero2;
				break;
			}

			// Salida por pantalla del resultado
			System.out.print("\n\n\tLa operaci�n entre " + Integer.toBinaryString(numero1) + " y "
					+ Integer.toBinaryString(numero2) + " es igual a: " + Integer.toBinaryString(resultado));

			// Se pregunta si se quiere usar el programa de nuevo
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.print("\n\n\t\t\tGRACIAS POR USAR NUESTRO PROGRAMA \n\n");
	}
}
