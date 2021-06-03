package t2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*List<String> input = new ArrayList<>();
        input.add("My");
        input.add("Authors");
        input.add("Haruki Murakami");
        input.add("Franz Kafka");
        input.add("Charles Bukowski");
        Stream<String> stream = input.stream();

        stream.filter(str -> str.length() > 10)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
         */

        List<Human> humans = new ArrayList<>();
        humans.add(new Human(43, "Bob", "Miller",
                LocalDate.of(2021-43, 7, 5), 60));
        humans.add(new Human(11, "Juan", "Baker",
                LocalDate.of(2021-11, 2, 28), 23));
        humans.add(new Human(17, "Kyle", "Lee",
                LocalDate.of(2021-17, 8, 15), 39));
        humans.add(new Human(25, "John", "Oliver",
                LocalDate.of(2021-25, 12, 31), 50));
        humans.add(new Human(78, "Ron", "Fisher",
                LocalDate.of(2021-78, 4, 21), 98));
        Stream<Human> stream = humans.stream();

        stream.sorted(Comparator.comparingInt(wa -> wa.age + wa.weight)).forEach(System.out::println);
    }
}
