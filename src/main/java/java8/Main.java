package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.IntStream;


/**
 * Could you write a program that prints numbers from 0 to 500 and
 * for multiples of '5' print "X" instead of number and for multiples of '7' print "Y".
 * for multiplies of '5' and '7' both print Z.
 * for the others print just the number
 */

class Util {
    public static Consumer<String> printRef(String work) {
        Consumer<String> printLine = (s) -> System.out.println(s + "\n");
        return printLine;
    }
}

public class Main {

    public static void main(String[] args) {
        Predicate<Integer> filterBySeven = (n) -> n%7==0;
        Function<Integer,String> valueToAlpha = (n) ->  {
                String result = "";
            if ( n%7 ==0 && n%5==0) {
                result= "Z";
            } else if ( n%5 ==0) {
                result= "X";
            } else if ( n%7==0) {
                result= "Y";
            } else {
                result = String.valueOf(n);
            }
            return result;
        };
        IntStream.rangeClosed(0,500).boxed().
                map(valueToAlpha)
                .forEach((arg)-> System.out.printf(" %s",arg));

        Consumer<String> printLine = (s) -> System.out.println(s + "\n");

        String hello ="hello world";
        printLine.accept(hello);

        List<String> work = Arrays.asList(new String[]{"one","two ","three"});
        work.stream().forEach(Util::printRef);
    }
}
