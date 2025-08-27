interface 父类接口{
    void show();
}

class 子类实现 implements 父类接口{
    public void show() {
        System.out.println("我是子类实现的 show 方法");
    }
}

public class demo_super_2 {
    public static void main(String[] args) {
        子类实现 obj = new 子类实现();
        obj.show();
    }
}