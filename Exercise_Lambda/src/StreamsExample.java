import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Fahim", "C", 24),
                new Person("Ahsan", "C", 25),
                new Person("Nabil", "D", 24),
                new Person("Abir", "A", 25),
                new Person("Sajid", "B", 25)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));


        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);

    }
}
