package demo;
public class demo_线程 {
    public static void main(String[] args) {
        // 创建线程的第一种方式：继承Thread类
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
            }
        };
        thread1.start();

        // 创建线程的第二种方式：实现Runnable接口
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running");
            }
        });
        thread2.start();

        // 创建线程的第三种方式：使用Lambda表达式
        Thread thread3 = new Thread(() -> System.out.println("Thread 3 is running"));
        thread3.start();
    }
}
