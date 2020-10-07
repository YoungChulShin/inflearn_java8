package study.java.java8to11;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(() -> {
//            System.out.println("Thread " + Thread.currentThread().getName());
//        });

        Future<?> submit = executorService.submit(() -> {
            System.out.println("Thread " + Thread.currentThread().getName());
        });

        Callable<String> callable1 = () -> {
            return "test";
        };

        Future<String> submit1 = executorService.submit(callable1);
        System.out.println(submit1);


        executorService.shutdown();
    }
}
