public class FirstClass {

    public static void main(String[] args) {
        printFirstClass();

        printChars("Java is awesome");
        countNumberOfWords("This is actually interesting!");
    }

    public static void printFirstClass() {
        System.out.println("Print first class");
    }

    public static void printChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word .charAt(i)+" ");
        }
    }
    public static void countNumberOfWords(String str){
        int count =1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ')
                count++;
        }
        System.out.println("\n\nGiven string: "+str);
        System.out.println("Number of words: "+count);
    }
}
