package demo;
import java.util.Scanner;

public class demo_比较 {
    public static void main(String[] args) {
        String empty_str=null;
        String str="常量";
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        try {
            if ("常量".equals(empty_str)) {
                System.out.println("ceshi");
            } else {
                System.out.println(str);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
