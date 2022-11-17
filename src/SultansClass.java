import java.util.Scanner;

public class SultansClass {
    public static void main(String[] args) {
        System.out.println("Sultan's changes");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    }
    public static int countTheLength(String str){
     if (str.length()>0){
         return str.length();
     }else {
         return -1;
     }
    }
}
