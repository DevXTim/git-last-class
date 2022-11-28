import java.util.Scanner;
public class Karina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=sc.nextLine();

        christmasTree();
        newYearWish(name);

    }
    public static void christmasTree(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=1; i++){
            for(int j=1; j<=3; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void newYearWish(String name){
        System.out.println("Dear " + name + ",");
        System.out.println("From the bottom of my heart, I wish you much success in pursuing your dreams.");
        System.out.println("A New Year is like a blank book, and the pen is in your hands.");
        System.out.println("It is your chance to write a beautiful story for yourself.");
        System.out.println("Always remember, YOU ARE AMAZING!");
        System.out.println("Happy New Year!");
    }
}