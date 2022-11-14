import java.util.Scanner;

public class AlinasMethod {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
        ChristmasTree(num);
        }
        public static void ChristmasTree(int num) {
            for (int i = 1; i <= 5; i++) {
                for (int space = 1; space <= num - i; space++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(j);

                }
                System.out.println();

            }

        }
    }



