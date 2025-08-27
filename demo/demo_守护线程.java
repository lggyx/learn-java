public class demo_守护线程 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("守护线程正在运行...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        daemonThread.setDaemon(true); // 设置为守护线程
        daemonThread.start();

        System.out.println("主线程正在运行...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // ignore
        }
        System.out.println("主线程结束，守护线程也会随之结束。");
    }
}
