package study.java.java8to11;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {

        //UnaryOperator<String> hi = (s) -> "hi" + s;

        UnaryOperator<String> hi = Greeting::hi;
    }
}
