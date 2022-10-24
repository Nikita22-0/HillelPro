package com.hillel.pashchenko.lesson1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        long l = 3;
        float f = 4.4f;
        boolean boo = true;
        char c = 'A';
        String str = "Hello";
        String str2 = new String(new char[]{'H', 'i'});
        int i = 2, v = 3, d = 4;
        double j = 2.5, q = 3.5, r = 4.5;

        int sum = b + s;
        float sum2 = (float) (f + j);

        long negation = d - l;
        double negation2 = r - q;

        int multiplication = i * v;
        double multiplication2 = r * j;

        int division = d / i;
        double division2 = r / j;

        int remainder = v % i;
        double remainder2 = q % j;

        System.out.println("Сумма целочисленного - " + sum +
                "\nСумма числа с плавующей точкой - " + sum2 + "\n" +
                "\nРазность целочисленного - " + negation +
                "\nРазность числа с плавующей точкой - " + negation2 + "\n" +
                "\nУмножение целочисленного - " + multiplication +
                "\nУмножение числа с плавующей точкой - " + multiplication2 + "\n" +
                "\nДеление целочисленного - " + division +
                "\nДеление числа с плавующей точкой - " + division2 + "\n" +
                "\nОстаток от деления целочисленного - " + remainder +
                "\nОстаток от деления числа с плавующей точкой - " + remainder2 + "\n");

        i += v;
        j += q;
        System.out.println("Сумма с присвоением целочисленного - " + i + "\n" +
                "Сумма с присвоением числа с плавующей точкой - " + j + "\n");

        i -= d;
        j -= r;
        System.out.println("Разность с присвоением целочисленного - " + i + "\n" +
                "Разность с присвоением числа с плавующей точкой - " + j + "\n");

        i *= v;
        r *= j;
        System.out.println("Умножение с присвоением целочисленного - " + i + "\n" +
                "Умножение с присвоением числа с плавующей точкой - " + r + "\n");

        d /= s;
        r /= j;
        System.out.println("Деление с присвоением целочисленного - " + d + "\n" +
                "Деление с присвоением числа с плавующей точкой - " + r + "\n");

        v %= i;
        q %= j;
        System.out.println("Остаток от деления с присвоением целочисленного - " + v + "\n" +
                "Остаток от деления с присвоением числа с плавующей точкой - " + q + "\n");

        System.out.println("11.25 > 6.9 - " + (multiplication2 > sum2) + "\n" +
                "3 < 6 - " + (sum < multiplication) + "\n" +
                "1 = 1 - " + (remainder == negation) + "\n" +
                "1 != 1 - " + (remainder != negation) + "\n" +
                "1 = 1 and 1 != 1 - " + ((remainder == negation) && (remainder != negation)) + "\n" +
                "11.25 < 6.9 or 3 > 6 - " + ((multiplication2 < sum2) || (sum > multiplication)) + "\n");

        System.out.println(b + "\n" + --b + "\n" + ++b + "\n" + b + "\n" + b + "\n" + ++b + "\n" + --b
                + "\n" + b + "\n");

        int[] array = new int[10];
        for (int k = 0; k < array.length; k++) {
            array[k] = k;
        }
        System.out.println(Arrays.toString(array));
    }
}
