package Sorting;

public class BubbleSortImplementation {
    public static void print(int[] arr){
        for(int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
//        int [] arr = {5, -2, 6, 7, 8, 7, 2};
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        print(arr);
        for(int i = 0; i<n-1; i++){
            boolean swapped = false;
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                System.out.println("Code was returned");
                break;
            }

        }
        print(arr);
    }
}
