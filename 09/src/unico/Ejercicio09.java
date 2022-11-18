package unico;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * Implementar un método que decida si dos números enteros positivos son amigos.
		 * Dos números son amigos si la suma de los divisores propios (distinto de él
		 * mismo) del primer número es igual al segundo número, y viceversa. Ejemplos:
		 * (220 - 284), (1184 - 1210)
		 */
		
		final String AMIGO = "Son números amigos";
		final String NO_AMIGO = "No son números amigos";
		int num1;
		int num2;
		boolean amigos;
		String mensaje;
		
		num1 = Util.leerInt("Intorduzca un primer número: ");
		num2 = Util.leerInt("Introduzca un segundo número: ");
		
		amigos = esAmigo(num1, num2);
		
		mensaje = amigos ? AMIGO : NO_AMIGO;
		Util.escribir(mensaje);
	}

	public static boolean esAmigo(int n1, int n2) {
		boolean amigo = false;
		int sumaDiv1 = sumaDivisores(n1);
		int sumaDiv2 = sumaDivisores(n2);
			if (sumaDiv1 == sumaDiv2) {
				amigo = true;
			}
		
		return amigo;
	}

	public static int sumaDivisores(int n) {
		int suma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma += 1;
			}
		}
		return suma;

	}
}
