package imperative;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

/**
 * release version 5 not supported
 * working on trying to fix this error
 */
public class Main {
    public static void main(String[] args) {
        //imperative approach
        ArrayList<Person> people = new ArrayList<>() {
            {
                add(new Person("John", MALE));
                add(new Person("Maria", FEMALE));
                add(new Person("Mark", MALE));
            }
        };

        // Imperative approach
        System.out.println("Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

        //Declarative approach
        System.out.println("Declarative approach");
            people.stream()
                    .filter(person -> FEMALE.equals(person.gender))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        //or, to just put them in a list
            List<Person> females2 = people.stream()
                    .filter(person -> FEMALE.equals(person.gender))
                    .collect(Collectors.toList());

    }


    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
