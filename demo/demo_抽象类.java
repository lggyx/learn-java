package demo;
public class demo_抽象类 {

    public static void main(String[] args) {
        Person p1 = new Student();
        p1.run();
        p1 = new Teacher();
        p1.run();
    }

}

abstract class Person {
    public abstract void run();
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}

class Teacher extends Person {
    @Override
    public void run() {
        System.out.println("Teacher.run");
    }
}