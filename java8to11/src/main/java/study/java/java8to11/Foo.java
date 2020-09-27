package study.java.java8to11;

import java.util.function.Predicate;

public interface Foo {

    void pintName();

    /**
     * @implSpec
     * 이 구현체는 getName()으로 가져온 문자들을 대문자로 바꿔준다
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    static void printAnything() {
        System.out.println("Foo");
    }
}
