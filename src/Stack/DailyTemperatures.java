package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

//The brute-force approach is to consider each temperature and scan the elements to its right until we find the first greater temperature.
// We then calculate the difference between their indices and store it in the answer array.
// In the worst case, each element can require scanning O(n) elements, giving us O(n²) time complexity.
//
//To optimize this, we can use a monotonic decreasing stack.
// The stack stores indices of temperatures for which we haven't found a warmer day yet.
// When we encounter a temperature greater than the temperature at the index on top of the stack,
// we've found the next warmer day for that index,
// so we pop it and store currentIndex - previousIndex in the answer.
// We continue this while the current temperature is greater than the temperature corresponding to the top index.
//
//Each index is pushed once and popped at most once, so although we use a while loop,
// the overall time complexity is O(n),
// with O(n) auxiliary space.

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
         int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prev = stack.pop();
                answer[prev] = i - prev;
            }

            stack.push(i);
        }

        return answer;
    }
}