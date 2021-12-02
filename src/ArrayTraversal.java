public class ArrayTraversal {

    public static int[] buildArray(int desiredLength) {
        int[] newArray = new int[desiredLength];
        for (int i = 0; i < desiredLength; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static int countEven(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean sum28(int[] numbers) {
        int twoSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                twoSum += 2;
            }
        }
            if (twoSum == 8) {
                return true;
            }
            else{
                return false;
            }

    }
}
