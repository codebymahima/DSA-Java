package Sorting;

class HeightCheckerBubbleSort {
    public int heightChecker(int[] heights) {
        int [] expected = new int[heights.length];
        for(int i = 0; i<heights.length; i++){
            expected[i] = heights[i];
        }
        int n = heights.length;

        for(int i = 0; i<n-1; i++){
            boolean swapped = false;
            for(int j = 0; j<n-1-i; j++){
                if(expected[j]>expected[j+1]){
                    swap(expected, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }

        return count;

    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}