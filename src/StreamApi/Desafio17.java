package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .filter(i -> i > 1 && IntStream.range(2, i).noneMatch(j -> i % j == 0))
                .forEach(System.out::println);
    }
}
