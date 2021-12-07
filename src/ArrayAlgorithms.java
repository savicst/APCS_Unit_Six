public class ArrayAlgorithms {

    public static boolean checkForAllNegatives(int[] list) {
        boolean allNegative = true;
        for (int num : list){
            if (num>=0){
                allNegative = false;
            }
        }
        return allNegative;
    }

    public static boolean hasDupes(int[] list) {
        boolean anyDupes = false;
        int count=-1;
        for (int position : list){
            count++;
            for (int i=0; i<count; i++){
                if (position == list[i])
                    anyDupes= true;
            }
        }
        return anyDupes; // placeholder to avoid errors. You may need to change this.
    }


    public static int[] leftShift(int[] nums, int shift) {
        int[] newArr = new int[nums.length+ shift];
        int index = 0;
        for(int num : nums){
            newArr[index]= num;
            index++;
        }
        for(int i= index+1; i<newArr.length; i++){
            newArr[i] = 0;
        }
        return newArr; // placeholder to avoid errors. You may need to change this.
    }
}
