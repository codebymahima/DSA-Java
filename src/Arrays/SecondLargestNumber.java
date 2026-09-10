package Arrays;

class SecondLargestNumber {

    public int secondLargestElement(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > max){
                secMax = max;
                max = nums[i];
            }

            else if(nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }
        }

        if(secMax == Integer.MIN_VALUE){
            return -1;
        }

        return secMax;
    }
}