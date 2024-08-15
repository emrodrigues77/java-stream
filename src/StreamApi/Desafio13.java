package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10)
 * e exiba o resultado no console.
 */
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .filter(x -> x >= 5 && x <= 10)
                .forEach(System.out::println);
    }
}
