package ua.opnu.Task5;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConditionalConsumer {
    
    public static void conditionalAction(int[] array, Predicate<Integer> condition, Consumer<Integer> action) {
        for (int value : array) {
            if (condition.test(value)) {
                action.accept(value);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<Integer> printSquare = n -> System.out.println(n + "² = " + (n * n));
        
        System.out.println("Квадрати парних чисел:");
        conditionalAction(numbers, isEven, printSquare);
        
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Consumer<Integer> printDouble = n -> System.out.println(n + " * 2 = " + (n * 2));
        
        System.out.println("\nПодвоєні непарні числа:");
        conditionalAction(numbers, isOdd, printDouble);
    }
}
