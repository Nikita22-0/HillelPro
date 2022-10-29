package com.hillel.pashchenko.lesson17;

import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Double> patch = (minPatch) -> minPatch > 1500.0;
        System.out.println(patch.test(1500.1));
        System.out.println(patch.test(1500.0));
        System.out.println();

        Consumer<String> arraySymbols = (string) -> {
            char[] chars = string.toCharArray();
            System.out.println(Arrays.toString(chars));
        };
        arraySymbols.accept("Hello");
        System.out.println();

        Function<Integer, String> wordNumb = (numb) -> switch (numb) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "Unknown";
        };
        System.out.println(wordNumb.apply(10));
        System.out.println(wordNumb.apply(11));
        System.out.println();

        Supplier<Long> longSupplier = () -> 10000000000000000L;
        System.out.println(longSupplier.get());
        System.out.println();

        BiFunction<Double, Integer, String> subtraction = (aDouble, integer) -> {
            double diff = aDouble - integer;
            if (diff > 1) {
                return String.valueOf(diff);
            } else {
                return "Остаток меньше 1";
            }
        };
        System.out.println(subtraction.apply(10.1, 1));
        System.out.println(subtraction.apply(0.1, 1));
        System.out.println();

        FiveDigitFunction<Integer, Double, Long, Float, String> digitFunction = (integer, aDouble, aLong, aFloat) ->
                String.valueOf(integer + aDouble + aLong + aFloat);
        System.out.println(digitFunction.method(10, 10.1, 50000L, 5.5f));
        System.out.println();

        ToIntBiFunction<String, String> sumLengthStr = (s, s2) -> s.trim().length() + s2.trim().length();
        System.out.println(sumLengthStr.applyAsInt("    Different", "Method     "));
    }
}
