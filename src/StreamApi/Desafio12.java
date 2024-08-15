package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */
public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int product = list.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
