package demo;
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
