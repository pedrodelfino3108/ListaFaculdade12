package exercicios12;

public class Exercicio9 {
	public static boolean podeFormarTriangulo(int a, int b, int c) {

		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	public static void main(String[] args) {
		int lado1 = 5;
		int lado2 = 10;
		int lado3 = 3;

		boolean resultado = podeFormarTriangulo(lado1, lado2, lado3);
		System.out.println(
				"Os lados " + lado1 + ", " + lado2 + ", e " + lado3 + " podem formar um triângulo? " + resultado);
	}
}
