public class SaltaClass {
    
    public static void main(String[] args) {
        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"A", "B", "C"};
        String[] arr3 = new String[]{"B", "B", "A"};

        System.out.println(areEqual(arr1,arr3));
        System.out.println(areEqual(arr2,arr3));
        System.out.println(areEqual(arr1,arr2));

    }

    public static boolean areEqual(String[] arr1, String[] arr2) {
        //TODO IMPLEMENT THIS METHOD


        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;

        }
        return true;

    }
}



