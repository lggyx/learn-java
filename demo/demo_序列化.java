package demo;
import java.io.*;

class DemoObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public DemoObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class demo_序列化 {
    public static void main(String[] args) {
        String filePath = "object_data.ser";

        // 序列化
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            DemoObject obj = new DemoObject("这是一个对象的演示方法");
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            DemoObject obj = (DemoObject) ois.readObject();
            System.out.println(obj.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}