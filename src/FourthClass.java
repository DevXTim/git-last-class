import java.util.Arrays;

public class FourthClass {
    public static void main(String[] args) {
        int arr[]={23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        System.out.println("Array: "+Arrays.toString(arr));
        findDuplicateNumbers(arr);
    }
    public static void findDuplicateNumbers(int []arr){
        System.out.print("Duplicates: ");
        for(int i=0; i< arr.length-1;i++){
            int count=0;
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
