import java.util.Scanner;

public class JadiaClassMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        System.out.println("Number of even numbers are:" + calculate(numbers));

    }

    public static int calculate(int[] numbers) {
        int count =0;
        for (int i = 0; i < numbers.length ; i++) {
            if( numbers[i] %2 == 0){
                count++;
            }

        }
        return count;
    }
}

