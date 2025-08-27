package demo;
import java.util.Arrays;

public class demo_数组 {
    public static void main(String[] args) {
        /**
         * Integer[] array = {1, 2, 3, 4, 5};
         * for (Integer num : array) {
         * switch (num) {
         * case 1:
         * System.out.println("Number is 1");
         * break;
         * case 2:
         * System.out.println("Number is 2");
         * break;
         * case 3:
         * System.out.println("Number is 3");
         * break;
         * default:
         * System.out.println("Number is not 1, 2, or 3 is: " + num);
         * break;
         * }
         * }
         **/
        // String[] stringArray = {"Hello", "World", "Java"};
        // for (String str : stringArray) {
        // System.out.println("String is: " + str);
        // }
        // String[] stringArray2;
        // stringArray2 = new String[5];
        // stringArray2[1]="Hello";
        // for(String str:stringArray2){
        // System.out.println("String2 is: "+str);
        // }
        String[] oldArray = { "Hello", "World", "Java" };
        String[] newArray = new String[oldArray.length + 2];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        newArray[oldArray.length] = "Hello1";
        newArray[oldArray.length + 1] = "World2";
        System.out.println("New Array: " + Arrays.toString(newArray));
        System.out.println("Old Array: " + Arrays.toString(oldArray));
    }
}