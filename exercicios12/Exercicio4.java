package exercicios12;

import java.util.stream.IntStream;

public class Exercicio4 {

	public static double calcularMedia(int[] numeros) {
		if (numeros == null || numeros.length == 0) {
			throw new IllegalArgumentException("O array não pode ser nulo ou vazio");
		}

		return IntStream.of(numeros).average().getAsDouble();
	}

	public static void main(String[] args) {
		int[] arrayNumeros = { 10, 20, 30, 40, 50 };
		double media = calcularMedia(arrayNumeros);
		System.out.println("A média é: " + media);
	}
}