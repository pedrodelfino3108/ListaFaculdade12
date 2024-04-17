package exercicios12;

public class Exercicio5 {
	public static String inverterString(String s) {

		char[] letras = s.toCharArray();
		int esquerda = 0;
		int direita = s.length() - 1;
		while (esquerda < direita) {
			char temp = letras[esquerda];
			letras[esquerda] = letras[direita];
			letras[direita] = temp;
			esquerda++;
			direita--;
		}
		return new String(letras);
	}

	public static void main(String[] args) {
		String original = "Hello, World!";
		String invertida = inverterString(original);
		System.out.println("String Original: " + original);
		System.out.println("String Invertida: " + invertida);
	}
}
