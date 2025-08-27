package demo;
import java.util.LinkedList;

public class demo_LinkedList {
    public static void main(String[] args) {
        // 创建LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 添加元素
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // 遍历元素
        for (String str : list) {
            System.out.println(str);
        }

        // 获取元素
        String firstElement = list.get(0);
        System.out.println("第一个元素：" + firstElement);

        // 删除元素
        list.remove("World");
        System.out.println("删除后的元素：" + list);
    }
}
