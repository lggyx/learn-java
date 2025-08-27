import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

public class demo_对象 implements Cloneable {
    public void demo方法() {
        System.out.println("这是一个对象的演示方法");
    }
    public static void main(String[] args)throws Exception{
        //使用new关键字
        demo_对象 obj = new demo_对象();
        obj.demo方法();
        //使用Class类的newInstance()方法，这种方法需要添加异常处理
        demo_对象 innerObj= demo_对象.class.newInstance();
        innerObj.demo方法();
        //使用Contructor类的newInstance()方法
        Constructor<demo_对象> constructor = demo_对象.class.getConstructor();
        demo_对象 anotherObj = constructor.newInstance();
        anotherObj.demo方法();
        //使用Clone()方法,类需要实现Cloneable接口
        demo_对象 clonedObj = (demo_对象) obj.clone();
        clonedObj.demo方法();
        //使用反序列化
    }
}
