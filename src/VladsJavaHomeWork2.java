public class VladsJavaHomeWork2 {
    //        2. Write a program to print the sum of each COLUMN from a 2D array
//                Example
//        Array:
//        {23, 44, 21},
//        {45, 42, 31},
//        {73, 14, 0}
//        Output : Duplicate numbers - 141, 100 ,52
    public static void main(String[] args) {
        int sum = 0;                          // declaring and initializing a variable to store the sum of each COLUMN
        int info[][] = {                      // declaring and initializing an array
                {23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };

        for (int i = 0; i < info[0].length; i++) {          // iterating through rows
            for (int j = 0; j < info.length; j++) {   // iterating through columns
                {
                    sum = sum + info[j][i];              // adding column value to the sum
                }
            }
            System.out.print(sum + " ");                 // printing out the sum of a column
            sum = 0;                                     // resetting sum value to 0 to count a sum of the next column
        }
    }
}
