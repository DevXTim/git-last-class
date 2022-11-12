import java.util.Scanner;

public class NuraClassWithMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me about yourself");
        String bio = sc.nextLine();

        int count = countSpaces(bio);
        if(count>= 10) {
            System.out.println("Long");
        }
        else if(count>=5){
            System.out.println("Medium");
        }
        else{
            System.out.println("Small");
        }
    }


    static int countSpaces(String bio){
        int count =0;
        for(int i = 0; i < bio.length() -1; i++){
            if(bio.charAt(i)== ' ') {
                count++;
            }
        }
        return count;

    }
}
