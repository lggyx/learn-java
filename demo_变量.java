public class demo_变量 {
    static String 变量 = "我是一个静态变量";//静态变量
    String 实例变量 = "我是一个实例变量";//实例变量
    public static void main(String[] args) {
        // 创建对象
        demo_变量 demo = new demo_变量();
        System.out.println(demo.实例变量);
        demo.实例变量 = "我是一个新的实例变量";
        System.out.println(demo.实例变量);
        // 访问静态变量
        System.out.println(变量);
    }
}
