package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean todosPositivos = list.stream().allMatch(i -> i > 0);
        System.out.println(todosPositivos);
    }
}
