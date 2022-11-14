public class IrynaClass {
    public static void main(String[] args) {
        int nums[] = {15, 18, 44, 32, 75, 8, 35, 78, 10, 54, 75,21};
        int greatestNum = 0;
        int value = 0;

        System.out.println(calculateSum(nums, value));
        System.out.println(findGreatestNum(nums, greatestNum));
    }

    public static int findGreatestNum(int[] nums, int greatestNum) {
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > greatestNum) {
                greatestNum = nums[i];
            }
        }
        return greatestNum;
    }
    public static int calculateSum(int[] nums, int value){
        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            sum = sum + nums[i];

        }
        return sum;

}
}


