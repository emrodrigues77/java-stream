package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream()
                .filter(i -> i % 2 != 0)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
