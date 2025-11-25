package ua.opnu.Task3;

import java.util.Arrays;
import java.util.function.Predicate;

public class DoubleFilter {
    
    public static int[] filterByTwoConditions(int[] input, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        int[] result = new int[input.length];
        int count = 0;
        
        for (int value : input) {
            if (predicate1.test(value) && predicate2.test(value)) {
                result[count++] = value;
            }
        }
        
        return Arrays.copyOf(result, count);
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 30};
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        Predicate<Integer> greaterThan5 = n -> n > 5;
        
        System.out.println("Початковий масив: " + Arrays.toString(numbers));
        
        int[] filtered = filterByTwoConditions(numbers, isEven, greaterThan5);
        System.out.println("Парні числа більше 5: " + Arrays.toString(filtered));
        
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;
        Predicate<Integer> lessThan20 = n -> n < 20;
        
        int[] filtered2 = filterByTwoConditions(numbers, divisibleBy3, lessThan20);
        System.out.println("Числа кратні 3 і менше 20: " + Arrays.toString(filtered2));
    }
}
