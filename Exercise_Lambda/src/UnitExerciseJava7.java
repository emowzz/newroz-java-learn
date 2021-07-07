import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UnitExerciseJava7 {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
          new Person("Fahim", "C", 24),
                new Person("Ahsan", "C", 25),
                new Person("Nabil", "D", 24),
                new Person("Abir", "A", 25),
                new Person("Sajid", "B", 25)

        );

        //Sort list by last name

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //create a method that prints all elements in the list
        printAll(personList);

        System.out.println();

        //create a method that prints all people that have last name beginning with A
        printLastNameBeginnigWithA(personList, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });



    }

    private static void printAll(List<Person> personList)
    {
        for(Person p : personList)
        {
            System.out.println(p);
        }
    }



    private static void printLastNameBeginnigWithA(List<Person> personList, Condition condition)
    {
        for(Person p : personList)
        {
            if(condition.test(p))
            {
                System.out.println(p);
            }
        }
    }


}

interface Condition {
    boolean test(Person p);
}
