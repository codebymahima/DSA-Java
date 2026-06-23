package Binary_Search;


//Approach:
//  1. Apply Binary Search on versions from 1 to n.
//  2. If current version is good, search in the right half.
//3. If current version is bad, store it as a potential answer and continue searching in the left half.
//4. Continue until the search space is exhausted.
//5. Return the first bad version found.
//
//Time Complexity: O(log n)
//Space Complexity: O(1)
class VersionControl {

    int firstBad = 4; // example

    boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean result = isBadVersion(mid);
            if(!result){
                start = mid+1;
            }
            else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}
