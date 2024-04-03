package Homework.defaultMethod;

public interface ExampleInterface {
    default void talk() {
        System.out.println("default method interface is taking");
    }
    static void talk2() {
        System.out.println("static method interface is taking");
    }
}
