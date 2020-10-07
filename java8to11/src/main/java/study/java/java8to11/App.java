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
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Future<String> future = executorService.submit(() -> "hello");
//
//        // Blocking call
//        // 관련된 작업들은 해당 코드 뒤에 정의해야 한다
//        future.get();

        // 명시적 리턴
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete("test");

        System.out.println(future.get());

        // 리턴이 없 비동기
        CompletableFuture<Void> asyncFuture = CompletableFuture.runAsync(() -> {
            System.out.println("asyncFuture " + Thread.currentThread().getName());
        });

        asyncFuture.get();  // 이 문장이 없어도 실행은되나 get을 통해서 명시적으로 결과를 대기한다

        // 리턴이 있는 비동기
        CompletableFuture<String> supplierFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("supplierFuture " + Thread.currentThread().getName());
            return "done";
        });

        System.out.println(supplierFuture.get());

        // 콜백을 사전 정의 (Future만 썼을 때는 불가능했던 작업)
        CompletableFuture<String> supplierFutureCallback = CompletableFuture.supplyAsync(() -> {
            System.out.println("supplierFutureCallback " + Thread.currentThread().getName());
            return "done";
        }).thenApply((s) -> {
            System.out.println(s.toUpperCase());
            return "done2";
        });

        supplierFutureCallback.get();

        // 응답없는 콜백을 사전 정의 (Future만 썼을 때는 불가능했던 작업)
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("voidCompletableFuture " + Thread.currentThread().getName());
            return "done!";
        }).thenAccept(s -> {
            System.out.println(s.toUpperCase());
        });

        voidCompletableFuture.get();

        // 결과 값에 대한 참고 없이 단순히 실행만 하려면 thenRun() 을 사용하면 된다


        // ForkJoinPool 외에 별도로 정의한 ThreadPool을 이용해도 할 수 있다
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        CompletableFuture<Void> voidCompletableFutureWithThreadPool = CompletableFuture.supplyAsync(() -> {
            System.out.println("voidCompletableFuture " + Thread.currentThread().getName());
            return "done!";
        }, executorService).thenAccept(s -> {
            System.out.println(s.toUpperCase());
        });

        voidCompletableFutureWithThreadPool.get();
        executorService.shutdown();





    }
}
