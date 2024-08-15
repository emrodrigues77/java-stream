package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o
 * resultado no console.
 */
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
