package com.hillel.pashchenko.lesson18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final Stream<Object> empty = Stream.empty();
        empty.skip(0)
                .limit(5)
                .forEach(System.out::println);

        final List<String> stringList = Arrays.asList("first", " second ", " third ");
        final Stream<String> stream = stringList.stream();
        final List<String> collectList = stream
                .filter(e -> e.length() > 5)
                .distinct()
                .collect(Collectors.toList());

        final Stream<String> string = Stream.of("four", " five ", " six ");
        final List<String> collectInList = string
                .collect(Collectors.toList());

        final HashMap<Integer, String> stringHashMap = new HashMap<>();
        stringHashMap.put(1, "one");
        stringHashMap.put(2, "two");
        stringHashMap.keySet();
        Stream<String> stringStream = stringHashMap.values().stream();
        stringStream.collect(Collectors.toList())
                .forEach(System.out::println);

        final List<String> numList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        final List<Integer> integerStream = numList.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        Stream<String> stream1 = Stream.of("1   ", "2   ", "3");
        final Optional<String> parallel = stream1
                .parallel()
                .filter(e -> e.length() > 2)
                .findFirst();

        final User user = new User(5);
        Stream<String> reference = stringList.stream();
        Stream<User> refList = reference
                .map(String::toUpperCase)
                .map(User::parse)
                .map(user::sign)
                .map(User::new);

    }
}
