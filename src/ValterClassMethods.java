import java.util.Scanner;

public class ValterClassMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's odd or even:");
        int number = sc.nextInt();

        evenOrOdd(number);
        System.out.println("Git looks fun!!!");

    }
    static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
