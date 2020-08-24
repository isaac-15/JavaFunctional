package functionalinterface;
import java.util.function.*;

public class _Predicate {
    //psvm
    public static void main(String[] args) {
        //Declarative
        System.out.println(isPhoneNumValid("2533456789"));

        //Imperative
        System.out.println(isPhoneNumValidPredicate.test("2533456789"));

        //Chaining Predicates
         //.and
         System.out.println(isPhoneNumValidPredicate.and(contains4).test("2534445555"));
         //.or
         System.out.println(isPhoneNumValidPredicate.or(contains4).test("2223334444"));
    }

    //Imperative
    static boolean isPhoneNumValid (String phoneNum){
        return phoneNum.startsWith("253") && phoneNum.length() == 10;
    }

    //Declarative
    static Predicate<String> isPhoneNumValidPredicate =
            phoneNum -> phoneNum.startsWith("253") && phoneNum.length() == 10;

    static Predicate<String> contains4 =
            phoneNum -> phoneNum.contains("4");
}
