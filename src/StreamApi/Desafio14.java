package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maiorPrimo =  list.stream()
                .filter(i -> i > 1 && IntStream.range(2, i).noneMatch(j -> i % j == 0))
                .max(Comparator.naturalOrder());
        System.out.println("O maior número primo é: " + maiorPrimo.get());
    }
}
