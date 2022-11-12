import java.util.Scanner;

public class FourthClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name and surname.");
        String name = sc.nextLine();
        System.out.println("Your initials are : "+printInitials(name));
    }
    static String printInitials(String name){
       return name.charAt(0)+ "."+name.charAt(name.indexOf(' ')+1);
        }
    }

