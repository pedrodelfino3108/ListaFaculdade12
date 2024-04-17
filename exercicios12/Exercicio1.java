package exercicios12;

public class Exercicio1 {
	public static boolean isPrimo(int numero) {
		if (numero < 2) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 29;

		if (isPrimo(num)) {
			System.out.println(num + " é primo");
		} else {
			System.out.println(num + " não é primo");
		}
	}
}
