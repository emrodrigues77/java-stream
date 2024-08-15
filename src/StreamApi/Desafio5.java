package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double media = list.stream()
                .filter(i -> i > 5)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.println(media);
    }
}
