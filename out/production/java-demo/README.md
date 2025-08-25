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

<a color="red">如果频繁扩容，建议用 ArrayList，自动扩容且效率高，避免频繁手动复制数组</a>

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

<a color="red">可见性控制的复杂性</a>：对类内部的可见性需要仔细控制，使用不当可能导致不可见的功能性BUG，以及安全生产类问题

### 继承的优势和劣势

一个类继承另一个类，然后使用父类中的属性和方法。

















