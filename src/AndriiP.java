import java.util.Scanner;

public class AndriiP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        findOddOrEven(i);

    }

    public static void findOddOrEven(int i) {
        if (i == 0) {
            System.out.println("Zero");
        } else if (i % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
