package Sliding_Window;

public class MaxConsecutiveOnes_1 {

    // Pattern: Variable Sliding window
    // clue: max consecutive
    // time complexity: O(n)
    // space complexity: O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int maxlen= 0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right]!=0){
                maxlen = Math.max(right-left+1, maxlen);
            }
            else{
                left = right+1;
            }

        }
        return maxlen;
    }
}

