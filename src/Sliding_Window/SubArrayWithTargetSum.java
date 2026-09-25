package Sliding_Window;

import java.util.Scanner;


// in this question we need to return the window which sums up to target
// we have to use 1 based indexing in the answer
// for example:
// arr = {1,2,3,4,5}
// target = 15
// expected output: 1 5 (not 0 4)
public class SubArrayWithTargetSum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int target = sc.nextInt();
      int[] nums = new int[size];
      for(int i = 0; i<size; i++){
        nums[i] = sc.nextInt();
      }
      boolean found = false;
      int left = 0;
      int sum = 0;
      for(int right=0; right<size; right++){
        sum += nums[right];
        while(sum>target){
          sum -= nums[left];
          left++;
        }
        if(sum==target){
          System.out.println((left+1)+" "+(right+1));
          found = true;
          break;
          
        }
        }
        if(!found){
        
          System.out.println("-1");
        }
    }
}