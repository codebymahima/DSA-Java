package Prefix_Sum;

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        
        int [] prefix = new int[nums.length+1];
        int [] suffix = new int[nums.length+1];
        for(int i = 1; i<=nums.length; i++){
            prefix[0] = 0;
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        for(int j = nums.length-1; j>=0; j--){
            suffix[nums.length] = 0;
            suffix[j] = suffix[j+1] + nums[j];
        }
        for(int k = 0; k<nums.length; k++){
            if(prefix[k]==suffix[k+1]){
                return k;
            }
        }
        return -1;
    }
}