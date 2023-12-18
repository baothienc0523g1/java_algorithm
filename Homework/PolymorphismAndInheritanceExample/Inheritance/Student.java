package Homework.PolymorphismAndInheritanceExample.Inheritance;

public class Student extends Person{


    public Student(int age, String name) {
        super(age, name);
    }

    @Override
    public void write() {
        System.out.println("writing...");
    }
}
