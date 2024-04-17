package exercicios12;

public class Exercicio2 {
	public static long fatorialRecursivo(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * fatorialRecursivo(numero - 1);
		}
	}

	public static void main(String[] args) {
		int num = 5;
		long resultado = fatorialRecursivo(num);
		System.out.println("O fatorial de " + num + " é " + resultado);
	}
}
