package exercicios12;

public class Exercicio7 {
	public static boolean isAnoBissexto(int ano) {
		if (ano % 400 == 0) {
			return true;
		} else if (ano % 100 == 0) {
			return false;
		} else {
			return ano % 4 == 0;
		}
	}

	public static void main(String[] args) {
		int ano = 2024;
		boolean resultado = isAnoBissexto(ano);
		System.out.println("O ano " + ano + " é bissexto? " + resultado);
	}
}
