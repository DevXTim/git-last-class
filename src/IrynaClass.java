public class IrynaClass {
    public static void main(String[] args) {
        int nums[] = {15, 18, 44, 32, 75, 8, 35, 78, 10};
        int greatestNum = 0;

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
}


