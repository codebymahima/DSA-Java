package Sliding_Window;

import java.util.HashMap;

// Pattern : Variable sliding window
// clue: max consecutive
// time complexity: O(n)
// space complexity: O(n) as we used hashmap here
public class MaxConsecutiveOnes_3 {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int maxlen=0;
        for(int right = 0; right<nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            if(nums[right]!=0 || map.getOrDefault(nums[right],0)<=k){
                maxlen = Math.max(right-left+1, maxlen);

            }
            else{
                while(map.getOrDefault(nums[right],0)>k){
                    map.put(nums[left], map.get(nums[left]) - 1);

                    if(map.get(nums[left]) == 0){
                        map.remove(nums[left]);
                    }
                    left++;
                }
            }
        }
        return maxlen;
    }
}
