package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Desafio 2 - Imprima a soma dos números pares da lista:

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Stream<Integer> numerospares = numeros.stream().filter(n -> n%2 == 0);

        int resultado = numerospares.reduce(0, Integer::sum);

        System.out.println(resultado);

    }
}
