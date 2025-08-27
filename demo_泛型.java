import java.util.ArrayList;
import java.util.List;

public class demo_泛型 {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("hello");
        list.add("world");
        System.out.println(list.toString());

        demo_泛型 demo = new demo_泛型();
        demo.show(list);
        System.out.println(demo.get(0));
        System.out.println(demo.getAll());
        System.out.println(demo.getAll1());
    }

    void show(ArrayList<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    String get(int index) {
        return list.get(index);
    }
    List<String> getAll() {
        return list;
    }

    List<?> getAll1() {
        return list;
    }
}
