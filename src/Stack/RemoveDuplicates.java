package Stack;

import java.util.Stack;


//The algorithm is already O(n), but I can optimize the implementation by replacing Stack<Character> with a char[] and an integer top,
// avoiding object/boxing overhead and the additional traversal needed to build the result.

class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char top;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                top = stack.peek();
                if (c == top) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }

        }
        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}