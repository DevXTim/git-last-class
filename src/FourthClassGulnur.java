public class FourthClassGulnur {
    public static void main(String[] args) {
        System.out.println("New class added with new methods in Gulnur_branch1");
        String str="yes";
        System.out.println("Is Git fun? :"+ isFun(str));
        System.out.println("Second branch created and the existing file modified");
    }

    static boolean isFun(String str){
        return str.equalsIgnoreCase("yes");
    }

}
