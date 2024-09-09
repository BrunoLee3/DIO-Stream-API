package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Desafio 18 - Verifique se todos os números da lista são iguais:
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificacao = numeros.stream()
                .allMatch(n -> Objects.equals(n, numeros.getFirst()));

        System.out.println(verificacao);
    }
}
