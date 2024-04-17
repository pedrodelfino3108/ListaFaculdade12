package exercicios12;

public class Exercicio8 {
	public static int calcularPotencia(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		}

		int resultado = 1;
		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	public static void main(String[] args) {
		int base = 5;
		int expoente = 3;
		int resultado = calcularPotencia(base, expoente);
		System.out.println(base + "^" + expoente + " = " + resultado);
	}
}
