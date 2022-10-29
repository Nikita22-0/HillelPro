package com.hillel.pashchenko.lesson17;

@FunctionalInterface
public interface FiveDigitFunction<T , U, Q, G, R> {
    R method (T t,U u, Q q, G g);
}
