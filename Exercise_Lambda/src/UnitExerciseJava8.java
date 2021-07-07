import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class UnitExerciseJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Fahim", "C", 24),
                new Person("Ahsan", "C", 25),
                new Person("Nabil", "D", 24),
                new Person("Abir", "A", 25),
                new Person("Sajid", "B", 25)

        );

        //Sort list by last name

//        Collections.sort(people , (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //create a method that prints all elements in the list
        performConditionally(people, p -> true, p-> System.out.println(p));

        System.out.println();

        //create a method that prints all people that have last name beginning with A
        performConditionally(people, p -> p.getLastName().startsWith("C"), p-> System.out.println(p.getFirstName()) );



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

