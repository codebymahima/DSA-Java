package Arrays;

class ThirdMaxNumber {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            // Skip duplicate values
            if(nums[i] == max || nums[i] == secMax || nums[i] == thirdMax) {
                continue;
            }

            count++;

            if(nums[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }
            else if(nums[i] > secMax) {
                thirdMax = secMax;
                secMax = nums[i];
            }
            else if(nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }

        if(count < 3) {
            return (int) max;
        }

        return (int) thirdMax;
    }
}