package study.java.java8to11;

@FunctionalInterface    // 추상화 메서드가 1개이면 된다
public interface RunSomething {

    void doIt();

    static void printName() {
        System.out.println("test");
    }

    default void printAge() {
        System.out.println("40");
    }
}
