package demo;
import java.io.*;

public class demo_IO {
    public static void main(String[] args) throws IOException {
    // 输入流示例：字节流
    FileInputStream fis = new FileInputStream("input.txt");
    int byteData;
    while ((byteData = fis.read()) != -1) {
        System.out.print((char) byteData);
    }
    fis.close();

    // 输出流示例：字节流
    FileOutputStream fos = new FileOutputStream("output.txt");
    fos.write("Hello, World!".getBytes());
    fos.close();

    // 字符流示例：输入流
    FileReader fr = new FileReader("input.txt");
    int charData;
    while ((charData = fr.read()) != -1) {
        System.out.print((char) charData);
    }
    fr.close();

    // 字符流示例：输出流
    FileWriter fw = new FileWriter("output.txt");
    fw.write("Hello, World!");
    fw.close();

    // 节点流示例：直接操作文件
    File file = new File("test.txt");
    FileWriter nodeWriter = new FileWriter(file);
    nodeWriter.write("Node Stream Example");
    nodeWriter.close();

    // 处理流示例：缓冲流
    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    br.close();
}

}
