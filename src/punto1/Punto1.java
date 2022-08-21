
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Punto1 {
	public static void main(String arg[]) throws IOException {

		System.out.println("\n\n\tESTE PROGRAMA CONVIERTE N�MEROS BINARIOS, OCTALES Y HEXADECIMALES\n");

		// Se declara un objeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si volver a usar el programa
		int repetir;

		do {
			// Declaraci�n de las variables
			int numeroInicial = 0, decision;
			String conversion = null;

			// Se le pide al usuario que elija el tipo de n�mero que va a convertir
			System.out.print("\n\tDe qu� tipo es el n�mero que vas a ingresar? \n" + "\n\t1. Binario " + "\n\t2. Octal "
					+ "\n\t3. Hexadecimal " + "\n\n\tDecisi�n: ");
			decision = Integer.parseInt(in.readLine());

			// Se comprueba que la opci�n este bien elegida
			if (decision < 1 || decision > 3) {
				while (decision < 1 || decision > 3) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					decision = Integer.parseInt(in.readLine());
				}
			}

			// Se declara el n�mero dependiendo el sistema n�merico
			System.out.print("\n\tIngresa el n�mero: ");
			switch (decision) {
			case 1:
				numeroInicial = Integer.parseInt(in.readLine(), 2);
				break;
			case 2:
				numeroInicial = Integer.parseInt(in.readLine(), 8);
				break;
			case 3:
				numeroInicial = Integer.parseInt(in.readLine(), 16);
				break;
			}
			// Se le pide al usuario que elija a que sistema quiere convertir
			System.out.print("\n\tA qu� tipo de n�mero lo quieres convertir? \n" + "\n\t1. Binario " + "\n\t2. Octal "
					+ "\n\t3. Hexadecimal " + "\n\n\tDecisi�n: ");
			decision = Integer.parseInt(in.readLine());
			// Se comprueba que la opci�n este bien elegida
			if (decision < 1 || decision > 3) {
				while (decision < 1 || decision > 3) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					decision = Integer.parseInt(in.readLine());
				}
			}

			// Se reasigna el valor del numero
			switch (decision) {
			case 1:
				conversion = Integer.toBinaryString(numeroInicial);
				break;
			case 2:
				conversion = Integer.toOctalString(numeroInicial);
				break;
			case 3:
				conversion = Integer.toHexString(numeroInicial);
				break;
			}
			// Salida por pantalla del resultado
			System.out.print("\n\n\tEl n�mero convertido es: " + conversion);

			// Se pregunta si se quiere usar el programa de nuevo
			System.out.print("\n\n\tQuieres volver a convertir un n�mero: \n\t1. Si\n\t2. No\n\tDecisi�n: ");
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
