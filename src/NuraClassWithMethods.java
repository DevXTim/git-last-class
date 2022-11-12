import java.util.Scanner;

public class NuraClassWithMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me about yourself");
        String bio = sc.nextLine();

        int count = countSpaces(bio);
        if(count>= 20) {  //added more spaces to consider it long
            System.out.println("Long bio"); // added word bio
        }
        else if(count>=10){ // same here
            System.out.println("Medium bio");
        }
        else{
            System.out.println("Small bio");
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
