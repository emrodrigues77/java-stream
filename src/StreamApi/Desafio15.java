package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */
public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean containsNegative = list.stream().anyMatch(x -> x < 0);
        System.out.println(containsNegative);
    }
}
