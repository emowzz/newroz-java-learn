import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Fahim", "C", 24),
                new Person("Ahsan", "C", 25),
                new Person("Nabil", "D", 24),
                new Person("Abir", "A", 25),
                new Person("Sajid", "B", 25)

        );

        System.out.println("Printing all persons");
        performConditionally(people, p -> true, System.out::println); //p -> Method Reference

    }



    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer)
    {
        for(Person p : people)
        {
            if(predicate.test(p))
            {
                consumer.accept(p);
            }
        }
    }
}


