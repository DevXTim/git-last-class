public class YanaClass {
    public static void main(String[] args) {
        System.out.println("Hello from Yana Class");

        int a = 12;
        int b = 5;
        System.out.println(getMultiplication(a, b));


    }
    public static int getMultiplication(int a, int b){
        int mul = a * b;
        return mul;
    }
}
