package desafios;

import java.util.*;

//Desafio 14 - Encontre o maior número primo da lista:
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream().filter(Desafio14::isPrime).max(Comparator.naturalOrder());

        System.out.println(maiorPrimo);
    }

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
