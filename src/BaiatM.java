public class BaiatM {
    public static void main(String[] args) {
        System.out.println("Baiat was here");
        for (int i=0;i<3;i++){
            for(int s=i;s<3;s++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<4;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for (int j=0;j<7-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
