public class demo_this {
    public static void main(String[] args) {
        demo_this dt = new demo_this();
        dt.test_this();
    }
    public void test() {
        System.out.println("测试");
    }
    public void test_father() {
        System.out.println("父类测试");
    }
    public void test_this() {
        this.test();
        this.test_father();
    }
}