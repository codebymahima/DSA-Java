package DNF;

//My approach: Counting Sort — O(n) time, O(1) space.
//DNF approach: One-pass 3-pointer partitioning — O(n) time, O(1) space.
//Advantage of DNF: sorts in a single traversal and teaches the reusable partitioning/two-pointer pattern.


class SortColors {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

// My approach-------------------------------------------------
//    public void sortColors(int[] nums) {
//        int white = 0;
//        int red = 0;
//        int blue = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                red++;
//            } else if (nums[i] == 1) {
//                white++;
//            } else {
//                blue++;
//            }
//        }
//        int i = 0;
//        while (red > 0) {
//            nums[i] = 0;
//            i++;
//            red--;
//
//        }
//        while (white > 0) {
//            nums[i] = 1;
//            i++;
//            white--;
//        }
//        while (blue > 0) {
//            nums[i] = 2;
//            i++;
//            blue--;
//        }
//
//    }
}

  
