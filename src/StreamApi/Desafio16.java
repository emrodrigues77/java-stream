package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e
 * outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = list.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        List<Integer> impares = list.stream()
                .filter(i -> i % 2 != 0)
                .toList();

        System.out.println(pares);
        System.out.println(impares);
    }
}
