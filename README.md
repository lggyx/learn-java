<h1>Java学习Demo</h1>

## 基础概念

### JVM,JRE,JDK

> JDK包括环境和执行工具
>
> JRE运行环境
>
> JVM执行程序

### switch

```java
switch(str){
    case "str1":
        break;
    case "str2":
        break;
    default:
        break;
}
```

### 数组

Java的数组是一个固定长度的对象，跟C#一样，原数组没办法扩容，只能新建然后复制，但是可以使用系统自带的复制方法（效率未知）。

两种方法：

- System.arraycopy（最高效，适合大数组）
- Arrays.copyOf（代码更简洁，底层同样高效）

```java
import java.util.Arrays;
String[] oldArray = {"Hello", "World", "Java"};
String[] newArray = new String[oldArray.length + 2];
System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
// newArray 后面可以继续添加元素
```

```java
import java.util.Arrays;
String[] oldArray = {"Hello", "World", "Java"};
String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 2);
```

`<a color="red">`如果频繁扩容，建议用 ArrayList，自动扩容且效率高，避免频繁手动复制数组 `</a>`

`八股文`:组是Java中用于存储相同类型元素的容器。通过索引可以访问和操作数组中的 元素。使用数组可以方便地组织和处理大量相同类型的数据

个人评价：不如Python数组

### 多维数组

本质是数组的数组，时间复杂度会随着维度升高迭代

多维数组是由多个⼀维数组组成的数据结构，用于表示表格、矩阵等具有多行多
列的数据。通过多个索引可以访问和操作多维数组中的元素。多维数组的⻓度在创建时需要
指定，并且每个维度的索引范围从0到长度减1。

## 面向对象设计

### 封装的优势和劣势

Java中的封装-->将数据和方法包装在一个类中，对外隐藏内部细节，通过接口方式和访问问修饰符来控制对内部成员的访问。

`优点：`

1. 数据隐藏：避免直接访问和修改对象的数据-->反渗透
2. 隔离复杂性：将复杂代码封装，只给出必要的接口，减少外部依赖，降低类与类之间的复杂性，减少开发协同难度
3. 提供公共接口：对外提供统一的访问和操作方式，提供更好的交互方法，便于使用和维护

`缺点：`

`<a color="red">`可见性控制的复杂性 `</a>`：对类内部的可见性需要仔细控制，使用不当可能导致不可见的功能性BUG，以及安全生产类问题

### 继承的优势和劣势

```java
// TODO：父类
public class demo_继承_爹{
    static String 爹="爹";
}
// TODO：子类
public class demo_继承_儿子 extends demo_继承_爹 {
    public static void main(String[] args) {
        String 儿子=demo_继承_爹.爹;
        System.out.println(儿子);
        儿子="重写爹，我是儿子";//重写
        System.out.println(儿子);
    }
}
```

一个类继承另一个类，然后使用父类中的属性和方法。

`优势：`

1. 代码复用
2. 扩展性
3. 继承建立了对象之间的关系，通过继承，可以形成类的体系结构，使得程序逻辑更加清晰和有组织性。

`劣势：`

1. 继承层次过深复杂
2. 导致类之间的紧耦合
3. 单一继承限制

> 接口的使用，是因为Java中继承具有单一性，一个类只能继承一个父类

### 多态的优势和劣势

**实现条件**

1. 存在继承关系
2. 子类重写父类的方法
3. 使用父类类型的引用变量来引用子类对象

`优势：`

1. 代码的灵活性
2. 代码的可扩展性
3. 可以实现接口的透明性
4. 可以实现方法的回调
5. 提高代码的可读性和可维护性

`劣势：`

1. 简单功能的过度抽象化
2. 运行时开销
   - 运行时需要动态绑定和虚函数表等机制来确定方法的调用
3. 引入复杂性

### 重写与重载的区别

重写：发生在父子类中（继承关系），方法名相同，参数列表相同

重载：发生在同一类中，方法名相同，参数列表不同

### 实例变量与静态变量的区别

`实例变量：`属于对象的，在创建对象时存储在内存堆里，创建多少个对象，就会有多少实例变量在内存中，**需要通过引用变量来访问**。

`静态变量：`属于类的，在类被加载时存储在内存方法区中，静态变量在内存中都只有一份，

**通过类名点来访问**。

### 抽象类的特点

- 由abstract修饰
- 可以包含变量、常量、构造方法、普通方静态方法、抽象方法
- 派生类通过extends继承
- 只能继承一个
- 抽象类中的成员、任何访问权限都可以

```java
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
```

### 接口的特点

- 由interface定义
- 可以包含常量，抽象方法abstract，静态方法static，默认方法，私有方法private
- 实现类通过implements实现
- 可以实现多个
- 接口中的成员，访问权限只能是public

### Java中值传递含义

- 对于基本类型而言，传递的是具体的值的副本
- 对于引用类型而言，传递的是具体的地址的副本

### ==和equals方法

==比较的是变量（栈）内存中存放的对象的（堆）内存地址，用来判断两个对象的地址是否相同，即是否是指相同一个对象。`比较的是地址`

equals：用来比较的是两个对象的内容是否相等，由于所有的类都是继承自java.lang.Object类的，所以适用于所有对象，`比较的值`

> 阿里的代码规范中只使用equals
>
> `所有比较是否相等是，都是用equals并且在对常量相比较是，把常量写在前面，因为使用object的equals object可能为null 则空指针`

### this关键字

1. 引用当前对象
2. 解决命名冲突
3. 在构造方法中引用其他构造方法

> this关键字只能在实例方法和构造方法中使用，不能再静态方法中使用。因为静态方法不依赖于具体的对象实例，所以在静态方法中无法引用this关键字。

**this关键字用于引用当前对象，解决命名冲突，以及在构造方法中引用其他构造方法。通过this关键字，我们可以更方便的访问对象的成员变量和调用当前对象的方法。**

### Java中的super关键字

在Java中，super是一个特殊的关键字，用于引用父类（超类）的成员或调用父类的构造方法。

1. 引用父类的成员
   - 当子类和父类有同名的成员变量或方法时，可以使用super关键字来引用父类的成员。
   - 通过super关键字，可以明确指定要访问的父类的成员，而不是子类的成员
2. 调用父类的构造方法
   - 当子类继承父类的时候，可以使用super关键字来调用父类的构造方法
   - 在子类的构造方法中使用super关键字调用父类的构造方法，可以完成对父类的初始化操作

```java
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
```

### static关键字的作用

1. 修饰变量
2. 修饰方法
3. 静态代码块
4. 静态内部类

```java
static int staticVar=0;//修饰变量
static void staticMethod(){...}//修饰方法
static {
    int a=1;
    String b="1";
    System.out.printIn("1");
}//静态代码块

```

### final关键字的作用

1. 修饰变量
2. 修饰方法
3. 修饰类
4. 修饰参数

> final关键字的主要作用是用来增加代码的安全性和可读性，缺点是会降低可拓展性和可读性

### Java中的内部类

- 成员内部类
- 静态内部类
- 局部内部类
- 匿名内部类

**内部类可以访问外部类的私有成员，外部类无法直接访问内部类的成员**

## 基础API应用分析

### Object类常用方法及应用场景

Object类所有类的根类，在Java中，每个类都直接或间接继承这个类。

| API                   | 说明                                                                                                                          |
| --------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| equals                | 用于比较两个对象是否相等，需要区分的是 `==`,后者比较的是指向地址                                                            |
| hashCode              | 返回对象的哈希值                                                                                                              |
| toString              | 返回对象的字符串表示                                                                                                          |
| getClass              | 返回对象的运行时类                                                                                                            |
| finalize              | 用于资源释放（不推荐）                                                                                                        |
| clone                 | 创建并返回当前对象的一个拷贝。**使用该方法，对象所属的类必须实现Cloneable接口**，可以用于实现深拷贝，即复制对象及其引用 |
| wait,notify,notifyAll | 用于线程间的通信和同步。这些方法搭配**synchronized**关键字使用，使用线程的等待和唤醒机制                                |
| instanceof            | 判断对象是否属于某个类或其子类的实例。用于类型检查，以确保对象在类型转换之前是安全的                                          |

### String，StringBuffer，StringBuilder区别

#### 可变性

String是不可变的类，即一旦创建了字符串对象，就不能修改其内容。

StringBuffer和StringBuilder是可变的类，他们支持对字符串进行动态修改（**CRUD**）

#### 线程安全性

String是线程安全的，适用于多线程环境。

StringBuffer是线程安全的，他的方法使用了syncchronized关键字进行同步，保证了多线程环境下的安全性。

StringBuilder是非线程安全的，他的方法没有进行同步处理。**在单线程环境下，StringBuilder的性能比StringBuffer更高**。

#### 性能

String的不可变性给它带来了一些性能上的优化，比如字符串常量池的使用。

SringBuffer和StringBuilder的可变性-->更好的的操作性能

### 自动拆箱封箱

- 装箱-->自动将基本数据类型转换为包装器类型
- 拆箱-->自动将包装器类型转换为基本数据类型

```java
public class demo_拆箱封箱 {
    public static void main(String[] args) {
        // 装箱
        int num = 10;
        Integer boxedNum = num; // 自动装箱
        System.out.println("装箱后的值：" + boxedNum);

        // 拆箱
        Integer anotherBoxedNum = 20;
        int unboxedNum = anotherBoxedNum; // 自动拆箱
        System.out.println("拆箱后的值：" + unboxedNum);
    }
}
```

### ArrayList特点及应用场景

1. 动态数组
2. 随机访问
3. 允许存储重复元素
4. 非线程安全
5. 删除和插入效率较低
6. 应用：快速访问元素，对元素进行随机频繁访问。用于保存和处理大量数据的集合。

**数据量较大时或频繁进行添加和删除操作，会导致频繁的内存重新分配和数据复制，影响性能。**

### LinkedList特点及应用场景

1. 双向链表
2. 高效的插入和删除
3. 支持添加、删除、获取等操作
4. 可用作队列和栈
5. 非线程安全
6. 应用场景：频繁插入删除操作 **快速索引还是使用ArrayList**

### ArrayList和LinkedList的区别

1. 底层数据结构：ArrayList【数组】，LinkedList【链表】
2. 插入和删除操作
3. 访问元素效率
4. 空间消耗

### Java中的泛型及应用

泛型提供了编译时类型安全检测机制

本质时参数化类型-->允许在类、接口、方法的定义中使用类型参数

- 泛型类和接口
- 泛型方法
- 类型通配符
- 类型推断：Java 7引入了类型推断，使得在使用泛型时可以省略类型参数的声明。

```java
TODO：
    diamond语法可以简化创建泛型实例的代码
    List<String> list=new ArrayList<>();
```

**Int是Integer的父类类型**

> 使用泛型的好处是可以提高代码的类型安全性，减少类型转换的错误，并且让代码更加通用和可读。通过使用泛型，可以在编译时期对代码进行更严格的类型检查，并提供更好的代码提示。

### Java中的泛型类型擦除

**Java中的泛型基本上是在编译器这个层次来实现的。在生成的Java字节代码中时不包含反省中的类型信息的**

使用泛型的时候加上的类型参数，会被编译器在编译的时候去掉。这个过程就称为类型擦除。

### 谈谈Java中泛型的理解

1. 类型安全性
2. 代码重用性
3. 可读性和安全性提高
4. 避免了强制类型转换

泛型只存在于编译阶段，在运行时会被擦除。-->意味着在生成的字节码中，所有的泛型信息都会被擦除，泛型类或方法在运行时将没有泛型类型的信息。-->为了保持于之前版本的Java的兼容性。

### Java中创建对象的方式

1. 使用new关键字
2. 使用Class的newInstance（）方法
3. 使用Constructor类的newInstance()方法
4. 使用clone()方法
5. 使用反序列化

**不管使用哪种方式创建对象，最终都会在内存中为对象分配空间，并调用构造方法来进行初始化。**

### Java中的IO如何分类

根据流向分为输入流和输出流。

根据操作单元分为字节流和字符流

根据流的角色分为节点流和处理流

### Java中的线程对象状态

1. 新建状态 New
2. 就绪状态 Runnable
3. 运行状态 Running
4. 阻塞状态 Blocked
5. 等待状态 Waiting
6. 超时等待状态 Timed Waiting
7. 终止状态 Terminated

**不同状态的转换是由Java虚拟机和操作系统来控制的，开发人员无法人为控制和干预线程对象的状态转换过程**

### 

### Java中的守护线程

在Java中，线程分为两种：用户线程和守护线程。

用户线程是程序中普通的线程，当所有的用户线程都执行完毕后，Java虚拟机会退出。

守护线程则是一种特殊的线程，主要提供后台服务和支持性工作。

守护线程的特点：

1. 守护线程是在程序中被创建的，和用户线程类似，可通过**setDaemon(true)**方法设置为守护线程。
2. 当所有的用户线程结束时，即使守护线程还未执行完毕，Java虚拟机也会退出，不会等待守护线程完成。
3. 守护线程主要用于执行一些非核心，非必要的任务，例如垃圾回收线程就是一个守护线程。

### Synchronized关键字

用于实现线程之间的同步。

- 修饰方法
- 修饰代码块
- 修饰静态方法

`特点：`

1. 同一时间只有一个线程可以执行同步代码块或同步方法，从而保证共享资源的安全访问。
2. 具有原子性，即在同步代码块或同步方法内的操作不会被其他线程打断。
3. 具有可见性，即一个线程对共享变量的修改会立即对其他线程可见。
4. 重量级锁，获取和释放锁涉及到用户态和内核态之间的切换，会带来一定的性能开销。

> 只能实现线程之间的互斥访问共享资源，不能保护数据的原子性。如果需要保证数据操作的原子性，可以使用java.util.concurrent,atomic包下的原子类，或者使用Lock接口的实现类，如ReentrantLock。

### 序列化和反序列化

将对象转换为字节序列和将字节序列转换为对象的过程。

序列化：将对象转换为字节流的形式，使得对象可以被存储，传输或持久化。

反序列化：将字节流转换成原始对象的过程。

Java中提供了序列化和反序列化的机制，通过实现`Serializable`接口并使用`ObjectOutputStream`和`ObjectInputStream`类进行对象的序列化和反序列化操作。需要注意的是，被序列化的对象的类必须实现`Serializable`接口，同时要注意类的版本号和成员变量的序列化和反序列化顺序的一致性。

### 反射技术

反射技术是Java中一种强大的功能，它允许程序在运行时动态的获取和操作类的信息。通过反射，可以在运行时通过获取类的名称、方法、字段等信息，动态的创建对象、调用方法、访问和修改字段，以及执行其他与类相关的操作。

1. Class类：代表一个类或接口，在运行时可以通过它获取和操作类的信息，例如获取类的名称、父类、实现的接口、构造函数、方法、字段等
2. Constructor类：代表类的构造函数，在运行时可以通过它创建对象。
3. Method类：代表类的方法，在运行时可以通过它调用方法。
4. Field类：代表类的字段，在运行时可以通过它访问和修改字段的值。

**通过反射，可以实现：**

- 动态创建对象：相当于调用了该类的无参构造函数。

```java
Class<?> cl=MyClass.class;
Object obj=cl.newInstance();
```

- 动态调用方法：通过Method类的invoke（）方法可以调用类的方法，可以传递参数并返回值。

```java
Class<?> cl=MyClass.class;
Object obj=cl.newInstance();
Method method=cl.getMethod("methodName",int.class);
Object result=method.invoke(obj,123);
```

- 动态访问和修改字段

```java
Class<?> cl=MyClass.class;
Object obj=cl.newInstance();
Field field =cl.getDeclaredField("fieldName");
field.setAccessible(true);
field.set(obj,newValue);
```

### HashMap特点及应用场景

1. 高效的查找和插入操作
2. 键值对存储
3. 无序的元素
4. 线程不安全
5. 可变大小















