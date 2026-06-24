package Binary_Search;

//Approach:
//We only compare mid and mid+1 and not mid, mid+1 and mid-1 to avoid index -1
//To avoid the index out of bounds exception for mid+1=nums.length and mid-1=-1:
//Modify the while loop condition to (start<end), this way mid+1 can only be upto nums.length-1
//Do not compare mid-1, only compare mid and mid+1 and not mid, mid+1 and mid-1 to avoid index -1
//time complexity: O(logn)
//space complexity O(n)

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1) return start;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
