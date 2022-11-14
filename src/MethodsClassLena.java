import java.util.Scanner;

public class MethodsClassLena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello from Lena");
        String word = sc.nextLine();
        String whiteSpaces = "";

        System.out.println(word.replaceAll(" ", ""));
    }
}



