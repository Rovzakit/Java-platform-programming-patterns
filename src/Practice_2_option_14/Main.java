package Practice_2_option_14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

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

        humans.stream().sorted(Comparator.comparingInt(wa -> wa.age + wa.weight)).forEach(wa -> wa.Out());
        System.out.println();
        humans.stream().filter(a -> a.age % 5 == 0).forEach(a -> a.Out());
        System.out.println();
        humans.stream().limit(4).forEach(h -> h.Out());
        System.out.println();
        humans.stream().forEach(x -> System.out.println(x.firstName + ' ' + x.lastName));
    }
}