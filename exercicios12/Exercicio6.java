package exercicios12;

import java.util.HashSet;
import java.util.Set;

public class Exercicio6 {
    public static int contarVogais(String s) {
        Set<Character> vogais = new HashSet<>();
        for (char v : "aeiouAEIOU".toCharArray()) {
            vogais.add(v);
        }

        int contador = 0;
        for (char c : s.toCharArray()) {
            if (vogais.contains(c)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "Hello, World!";
        int numVogais = contarVogais(texto);
        System.out.println("Número de vogais em '" + texto + "': " + numVogais);
    }

}
