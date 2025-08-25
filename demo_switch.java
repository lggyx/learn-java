public class demo_switch {
    public static void main(String[] args) {
        Integer num = 9;
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not 1, 2, or 3");
                break;
        }
    }
}