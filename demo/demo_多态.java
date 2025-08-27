package demo;
public class demo_多态 {
    public static void main(String[] args) {
        Person p = new Person();
        p.run();

        p = new Student();
        p.run();
    }
}
class Person {
    public void run() {
        System.out.println("Person.run");
    }
}
class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}