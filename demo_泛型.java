import java.util.ArrayList;

/**
 */
public class demo_泛型 {
    ArrayList<String> list = new ArrayList<>();
    
    public static void main(String[] args) {
        demo_泛型 d=new demo_泛型();
        d.list.add("hello");
        d.list.add("world");
        System.out.println(d.list.toString());
    }
}
