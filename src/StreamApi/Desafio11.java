package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                .map(i -> i * i)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
