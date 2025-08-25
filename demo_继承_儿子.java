public class demo_继承_儿子 extends demo_继承_爹 {
    public static void main(String[] args) {
        String 儿子=demo_继承_爹.爹;

        System.out.println(儿子);

        儿子="重写爹，我是儿子";

        System.out.println(儿子);
    }
}
