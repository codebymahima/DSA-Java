package LinkedList;

// Problem 141: leetcode
// we had to tell if a cycle exists in the linked list or not
// my first approach was to go by value, but it no where said that two different nodes cant have the same value
// second approach was to go by hashset but again here also values could be same
// in the second approach if I use ListNode as the data type instead of integer then my solution is actually valid
// the 2 pointer approach (the final solution) is to make 2 references slow and fast
// slow shifts slower than fast, therefore fast will reach the tail eventually
// if there is any cycle then at some point fast will re iterate the nodes
// since it moves faster it will eventually catch up with slow
// if fast and slow refer to the same node at any point that means there was a cycle through which fast came behind
// hence we will return true or else false
// time complexity: O(n) since the fast pointer is moving faster than slow therefore it will be limited to a certain number
// space complexity: O(1) as we didnt take any extra memory


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}

public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }

        
        return false;
    }
}