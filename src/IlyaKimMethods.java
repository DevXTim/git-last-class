public class IlyaKimMethods {
    public static void main(String[] args) {

        int[] arr = {12,23,43,54,56,67,78,89,90,123};
        System.out.println("Printing even array elements, made by IlyaKim1");
        findEvenElements(arr);
    }

    static void findEvenElements(int[] num){

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.print(num[i] + " ");
            }
        }
    }
}
