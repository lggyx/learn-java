package demo;
/**
 * static的作用
 * 1. 静态变量：属于类而不是实例，所有实例共享同一个静态变量。
 * 2. 静态方法：可以在没有实例化对象的情况下调用。
 * 3. 静态代码块：用于初始化静态变量，随着类的加载而执行。
 * 4. 静态类：可以包含静态成员，不能直接实例化。
 */
public class demo_static {
    //静态变量属于类，所有实例共享同一个静态变量
    static int staticVar = 0; // 静态变量

    //静态方法可以在没有实例化对象的情况下调用
    static void staticMethod() {
        System.out.println("调用静态方法");
    }

    //静态代码块用于初始化静态变量，随着类的加载而执行
    static {
        staticVar = 5;
        System.out.println("静态代码块执行");
    }
    public static void main(String[] args) {
        System.out.println("静态变量值: " + staticVar); // 访问静态变量
        staticMethod(); // 调用静态方法

        // 创建实例
        demo_static instance1 = new demo_static();
        demo_static instance2 = new demo_static();

        // 修改静态变量
        instance1.staticVar = 10;
        System.out.println("instance1 修改后的静态变量值: " + instance1.staticVar);
        System.out.println("instance2 访问的静态变量值: " + instance2.staticVar); // 共享同一个静态变量
    }
}
