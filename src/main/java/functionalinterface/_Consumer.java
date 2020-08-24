package functionalinterface;

import java.util.function.*;

public class _Consumer {

    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "555 555 5555"));
        greetCustomerConsumer.accept((new Customer("Maria", "555 555 5555")));

        printFullName("John", "Smith");
        printFullNameConsumer.accept("John", "Smith");
    }

    //customer class
    static class Customer{
        private final String name;
        private final String phoneNum;

        public Customer(String name, String phoneNum) {
            this.name = name;
            this.phoneNum = phoneNum;
        }
    }

    //consumer example
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.name + ". Your phone number is " + customer.phoneNum);

    static void greetCustomer(Customer c){
        System.out.println("Hello " + c.name + ". Your phone number is " + c.phoneNum);
    }


    //BiConsumer example
    static BiConsumer<String,String> printFullNameConsumer =
            (first, last) -> System.out.println(first + " " + last);

    static void printFullName(String first, String last){
        System.out.println(first + " " + last);
    }
}
