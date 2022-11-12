public class SecondClass {

    public static void main(String[] args) {
        System.out.println("Print second class");
        printNumbers(7);
    }

    public static void printNumbers(int nums){
        for ( int i= 0; i < nums; i++){
            System.out.println(i);
        }
    }
}
