package Two_Pointers;

class ZeroesAndOnes {
    void segregate0and1(int[] arr) {
        // code here
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast]==0) {
                swap(arr, slow, fast);
                slow++;
            }
        }
    }
	
	void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
