// 父类
class Animal {
    String name = "动物";

    Animal() {
        System.out.println("Animal 的无参构造方法被调用");
    }

    void show() {
        System.out.println("我是父类 Animal 的 show 方法");
    }
}

// 子类
class Dog extends Animal {
    String name = "狗";

    Dog() {
        // 调用父类构造方法
        super();
        System.out.println("Dog 的无参构造方法被调用");
    }

    void show() {
        System.out.println("我是子类 Dog 的 show 方法");
    }

    void printInfo() {
        // 访问父类成员变量
        System.out.println("父类 name: " + super.name);
        // 访问子类成员变量
        System.out.println("子类 name: " + this.name);
        // 调用父类方法
        super.show();
        // 调用子类方法
        this.show();
    }
}

public class demo_super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printInfo();
    }
}