//package study.java.java8to11;
//
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.IntConsumer;
//import java.util.function.Supplier;
//
//public class Foo {
//
//    public static void main(String[] args) {
//        Foo foo = new Foo();
//        foo.run();
//    }
//
//    private void run() {
//
//        int baseNumber = 10;
//
//        // 로컬 클래스
//        class LocalClass {
//            void printBaseNumber() {
//                System.out.println(baseNumber);
//            }
//        }
//
//        // 익명 클래스
//        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer baseNumber) {
//                System.out.println(baseNumber);
//            }
//        };
//
//        // 람다
//        IntConsumer printInt = (i) -> {
//            System.out.println(i + baseNumber);
//        };
//
//        printInt.accept(10);
//    }
//}
