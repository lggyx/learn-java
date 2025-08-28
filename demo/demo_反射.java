import java.lang.reflect.Field;

public class demo_反射 {
    public static void main(String[] args) {
        try {
            // 通过类名获取Class对象
            Class<?> clazz = Class.forName("java.util.ArrayList");

            // 创建ArrayList实例
            Object arrayList = clazz.getDeclaredConstructor().newInstance();

            // 获取add方法并调用
            java.lang.reflect.Method addMethod = clazz.getMethod("add", Object.class);
            addMethod.invoke(arrayList, "Hello");
            addMethod.invoke(arrayList, "World");

            // 获取size方法并调用
            java.lang.reflect.Method sizeMethod = clazz.getMethod("size");
            int size = (int) sizeMethod.invoke(arrayList);
            System.out.println("ArrayList size: " + size);

            // 获取get方法并调用
            java.lang.reflect.Method getMethod = clazz.getMethod("get", int.class);
            String firstElement = (String) getMethod.invoke(arrayList, 0);
            System.out.println("First element: " + firstElement);

            // 访问私有字段
            Field field = clazz.getDeclaredField("size");
            field.setAccessible(true);
            field.set(arrayList, 100);
            System.out.println("Modified size: " + field.get(arrayList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
