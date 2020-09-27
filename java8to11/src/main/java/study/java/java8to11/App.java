package study.java.java8to11;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("keesun");
        name.add("youngchul");
        name.add("toby");
        name.add("foo");

        // foreach
        //name.forEach(System.out::println);

        // splitter
        Spliterator<String> spliterator = name.spliterator();
        spliterator.tryAdvance(System.out::println);

        // comparator
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
    }
}
