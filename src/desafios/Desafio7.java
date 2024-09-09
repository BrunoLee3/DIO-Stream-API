package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Desafio 7 - Encontrar o segundo número maior da lista:
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maior = numeros.stream().max(Comparator.naturalOrder()).get();

        Optional<Integer> segundoMaior = numeros.stream().filter(n -> n < maior).max(Comparator.naturalOrder());

        System.out.println(segundoMaior);
    }
}
