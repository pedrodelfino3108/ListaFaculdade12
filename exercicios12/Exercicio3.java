package exercicios12;

public class Exercicio3 {
	public static boolean isPalindromo(String texto) {
		texto = texto.replaceAll("\\s", "").toLowerCase();

		int esquerda = 0;
		int direita = texto.length() - 1;

		while (esquerda < direita) {
			if (texto.charAt(esquerda) != texto.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "A base do teto desaba";
		if (isPalindromo(s)) {
			System.out.println("\"" + s + "\" é um palíndromo.");
		} else {
			System.out.println("\"" + s + "\" não é um palíndromo.");
		}
	}
}
