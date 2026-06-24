package Binary_Search;

//Approach:
// here we have to first see which half is sorted, in a rotated array one half is always sorted properly
// we calculate the mid, and then compare its value with the start value, if its greater than definitely left half is sorted
// else right half is sorted
// then we check if the target value lies in between the mid and start, if it does, then end = mid-1, else start = mid+1
// for right half if target lies between mid and end, then start = mid+1 else end = mid-1
// BASICALLY first check which array part is sorted and then put the conditions
//time complexity O(logn)
// space complexity O(1)


public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            // left half sorted condition
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            //right half sorted condition
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
