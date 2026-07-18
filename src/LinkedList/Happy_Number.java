package LinkedList;

// Problem 202: Leetcode
// we have to find if the given number is happy number or not
// happy number is a number whose sum of square digits eventually leads to 1
// example: 19
// 1 square + 9 square = 82
// 8 square + 2 square = 68
// 6 square + 8 square = 100
// 1 square + 0 square + 0 square = 1
// after doing detectcycle and cyclestart question, we now understand that wherever a point leads to exact 1 point, or
// where cycle is involved, floyd pattern can be used
// this question could be solved by using hashSet as well. but if we want O(1) space complexity, we need to use floyd slow and fast
// create a function to find the sum of square of digits
// create 2 pointers, slow and fast, in linkedlist we were moving slow by 1 and fast by 2
// here there is no list, we are simply doing slow = square(num) and fast = square(square(num)), its equivalent to the previous statement
// if the number is not a happy number then cycle will be formed hence at some point slow == fast
// if slow == 1 that means at some point the sum of square of digits of number = 1, hence its happy number
// else its not a happy number

// time complexity = O(n)
// space complexity = O(1)


class Happy_Number {
    public boolean isHappy(int n) {
       int slow = n;
       int fast = n;

       do{
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast));
       }
       while(slow!=fast);
    
        if(slow==1){
            return true;
        }
        return false;
        
    }
    private int findSquare(int number){
        int ans = 0;
        while(number>0){
            int rem = number % 10;
            ans += rem*rem;
            number/=10;
        }
        return ans;
    }
}