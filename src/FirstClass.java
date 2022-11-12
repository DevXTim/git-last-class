public class FirstClass {

    public static void main(String[] args) {
        printFirstClass();

        printChars("Java is awesome");
    }

    public static void printFirstClass() {
        System.out.println("Print first class");
    }

    public static void printChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word .charAt(i));
        }
    }
}
