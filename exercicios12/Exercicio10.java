package exercicios12;

public class Exercicio10 {

	public static double calcularMediaPonderada(double valor1, double valor2, double valor3, int peso1, int peso2,
			int peso3) {
		double numerador = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
		int denominador = peso1 + peso2 + peso3;

		if (denominador == 0) {
			throw new IllegalArgumentException("A soma dos pesos não pode ser zero.");
		}

		return numerador / denominador;
	}

	public static void main(String[] args) {
		double valor1 = 85.0;
		double valor2 = 90.0;
		double valor3 = 88.0;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;

		double mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
		System.out.println("A média ponderada é: " + mediaPonderada);
	}
}
