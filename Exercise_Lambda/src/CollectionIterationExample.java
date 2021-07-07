import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Fahim", "C", 24),
                new Person("Ahsan", "C", 25),
                new Person("Nabil", "D", 24),
                new Person("Abir", "A", 25),
                new Person("Sajid", "B", 25)

        );

        System.out.println("Using for loop");
        for(int i=0 ; i<people.size() ; i++)
        {
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop");
        for(Person p : people)
        {
            System.out.println(p);
        }

        System.out.println("For Each through Lambda");
        people.forEach(System.out::println);
    }
}
