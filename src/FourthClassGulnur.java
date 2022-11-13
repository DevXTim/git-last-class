public class FourthClassGulnur {
    public static void main(String[] args) {
        System.out.println("New class added with new methods in Gulnur_branch1");
        System.out.println("Is Git fun? :"+ isFun("yes"));
    }

    static boolean isFun(String str){
        if (str.equalsIgnoreCase("yes")) return true;
        return false;
    }

}
