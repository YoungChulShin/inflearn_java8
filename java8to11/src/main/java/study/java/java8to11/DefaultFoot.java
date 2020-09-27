package study.java.java8to11;

public class DefaultFoot implements Foo{

    String name;

    public DefaultFoot(String name) {
        this.name = name;
    }

    @Override
    public void pintName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
