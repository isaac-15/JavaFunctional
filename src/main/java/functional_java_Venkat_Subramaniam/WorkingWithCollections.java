package functional_java_Venkat_Subramaniam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class WorkingWithCollections {

    public static void main(String[] args) {
        /**
         * iterating through a list and printing out the elements
         */

        final List<String> friends =
                Arrays.asList("Jim", "Jack", "Sam");

        //IMPERATIVE
        for (int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }

        //simplified
        for (String s : friends){
            System.out.println(s);
        }

        //DECLARATIVE

        /**
         * This code passes a consumer into the forEach method.
         * We then create a new instance of the functional interface Consumer.
         * Then we go on to implement the abstract function accept.
         * We both instantiate and define the behavior of a new class at the same time, this is known as using an anonymous class
         */
        friends.forEach(new Consumer<String>(){
            public void accept(final String name){
                System.out.println(name);
            }
        });

    }
}
