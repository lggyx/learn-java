public class demo_synchronized {

    // 修饰实例方法
    public synchronized void syncMethod() {
        System.out.println("同步实例方法");
    }

    // 修饰代码块
    public void syncBlock() {
        synchronized (this) {
            System.out.println("同步代码块");
        }
    }

    // 修饰静态方法
    public static synchronized void syncStaticMethod() {
        System.out.println("同步静态方法");
    }
    
    public static void main(String[] args) {
        demo_synchronized obj = new demo_synchronized();
        obj.syncMethod();
        obj.syncBlock();
        demo_synchronized.syncStaticMethod();
    }
}
// 以上三种方式都可以实现线程同步，选择哪一种取决于具体的需求和场景。