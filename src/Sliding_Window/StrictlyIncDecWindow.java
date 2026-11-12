package Sliding_Window;

class StrictlyIncDecWindow {
    public int longestMonotonicSubarray(int[] nums) {

        int slow = 0;
        int increasingwindow = 1;
        int decreasingwindow = 1;

        int maxinc = 1;
        int maxdec = 1;

        for(int fast = 1; fast < nums.length; fast++) {

            if(nums[fast] > nums[fast-1]) {
                increasingwindow++;
            }
            else {
                increasingwindow = 1;
            }

            maxinc = Math.max(maxinc, increasingwindow);
        }

        for(int fast = 1; fast < nums.length; fast++) {

            if(nums[fast] < nums[fast-1]) {
                decreasingwindow++;
            }
            else {
                decreasingwindow = 1;
            }

            maxdec = Math.max(maxdec, decreasingwindow);
        }

        return Math.max(maxinc, maxdec);
    }
}