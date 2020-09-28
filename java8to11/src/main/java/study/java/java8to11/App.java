package study.java.java8to11;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("youngchul");
        names.add("toby");
        names.add("foo");

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        names.parallelStream().map(String::toUpperCase).collect(Collectors.toList());

        names.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
