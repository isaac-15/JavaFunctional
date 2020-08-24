package functionalinterface;


import java.util.function.*;

public class _Function {
    public static void main(String[] args) {
        int number = increment(1);
        System.out.println(number);

    //Function examples
        int number2 = plusOne.apply(1);
        System.out.println(number2);

        //one way
        Function<Integer,Integer> plusOneTimes10 =
                plusOne.andThen(times10);
        int number3 = plusOneTimes10.apply(1);
        System.out.println(number3);

        //another way to do the same thing
        int number4 = plusOne.andThen(times10).apply(1);
        System.out.println(number4);

    //BiFunction examples
        int number5 = multiply.apply(2,3);
        System.out.println(number5);
    }
    private static int increment(int num){
        return num + 1;
    }

    static Function<Integer, Integer> plusOne =
            number -> number + 1;
    static Function<Integer,Integer> times10 =
            num -> num * 10;

    static BiFunction<Integer,Integer,Integer> multiply =
            (num,num2) -> num * num2;




}
