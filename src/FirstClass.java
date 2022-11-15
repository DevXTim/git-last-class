public class FirstClass {

    public static void main(String[] args) {
        printFirstClass();

        printChars("Java is awesome and DevX is great!");
        countNumberOfWords("This is actually interesting!");
        message();
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
        System.out.println("Please enter odd numbers till 10");
    }
    public static void message(){
        System.out.println("hello world");
    }

    public static void vladsMethod(){
        System.out.println("Work hard and be consistent!");
    }
}