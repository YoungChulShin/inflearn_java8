package study.java.java8to11;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

       List<OnlineClass> springClasses = new ArrayList<>();
       springClasses.add(new OnlineClass(1, "spring boot", true));
       springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> onlineClasses = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        Optional<Integer> optionalInteger = onlineClasses.map(o -> o.getId());

        //onlineClasses.ifPresent(oc -> System.out.println(oc.getTitle()));

        OnlineClass onlineClass = onlineClasses.orElse(createNewClass());
    }

    private static OnlineClass createNewClass() {
        System.out.println("New Class");
        return new OnlineClass(10, "New Class", false);
    }
}
