package LinkedList;

// Problem 876: leetcode
// we have to find the middle node of the list and return the node
// my approach was to find the length of the list, and then find the middle element by dividing the length by 2 and using a simple loop
// however, an optimised solution to this problem is to use only 1 loop by using floyd slow fast approach
// slow = slow.next and fast = fast.next.next, by the time fast will reach the end, slow will reach the mid cuz its speed is half the speed of fast
// in both the approaches:
// time complexity = O(n)
// space complexity = O(1)

class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;

        for (int i = 1; i <= size / 2; i++) {
            temp = temp.next;
        }
        return temp;

    }
}