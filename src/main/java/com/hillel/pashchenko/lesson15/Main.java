package com.hillel.pashchenko.lesson15;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final FirstClass firstClass = new FirstClass();
        final SecondClass secondClass = new SecondClass();
        firstClass.method();
        firstClass.firstContractMethod();
        firstClass.secondContractMethod();
        First.staticMethod();
        Second.staticMethod();
        System.out.println();

        secondClass.method();
        secondClass.firstContractMethod();
        secondClass.secondContractMethod();
        Third.staticMethod();
        Fourth.staticMethod();
        System.out.println();

        final Helper helper = new Helper();
        System.out.println(helper.optional("mail23@gmail.com"));
        Optional<Optional<String>> optional = Optional.ofNullable(helper.optional("mail"));
        optional.orElseThrow();
        System.out.println(optional.get());
    }
}
