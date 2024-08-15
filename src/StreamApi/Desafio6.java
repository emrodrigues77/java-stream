package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean temNumeroMaiorQue10 = list.stream().anyMatch(i -> i > 10);
        System.out.println(temNumeroMaiorQue10);
    }
}
