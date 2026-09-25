package Hashing;// Write your solution here
import java.util.*;

// in this question we were given that the input will be in 2 lines, first line will contain elements of nums1
// second line will contain elements of nums2
// since we are not getting the size of each array, we take them as array list and take the inputs
// to find common elements we use HashSets to store unique elements of both arrays and compare them
public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        String line1 = sc.nextLine();
        Scanner s1 = new Scanner(line1);

        while (s1.hasNextInt()) {
            nums1.add(s1.nextInt());
        }

        // Second line
        String line2 = sc.nextLine();
        Scanner s2 = new Scanner(line2);

        while (s2.hasNextInt()) {
            nums2.add(s2.nextInt());
        }
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num: nums1){
          set1.add(num);
        }
        for(int num: nums2){
          set2.add(num);
        }

        for(int num: set2){
          if(set1.contains(num)){
            ans.add(num);
          }
        }
        for(int num = 0; num<ans.size(); num++){
        System.out.print(ans.get(num)+ " ");
        }
        
    }
}
