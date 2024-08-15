package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer segundoMaior = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(segundoMaior);
    }
}
