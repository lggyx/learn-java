/**
 * final关键字
 * 1. 修饰变量
 * 2. 修饰方法
 * 3. 修饰类
 * 4. 修饰参数
 */
public class demo_final {
    //修饰变量
    final int num = 10; //常量
    //修饰方法
    public final void show() {
        System.out.println("show");
    }
    //修饰类
    public final class InnerClass {
        //修饰变量
        final int innerNum = 20; //常量
        //修饰方法
        public final void innerShow() {
            System.out.println("innerShow");
        }
    }
    //修饰参数
    public void display(final int value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        demo_final demo = new demo_final();
        demo.display(30);
        demo.show();
        demo.new InnerClass().innerShow();
    }
}
