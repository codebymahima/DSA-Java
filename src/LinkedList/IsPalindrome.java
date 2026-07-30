package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }

        ListNode temp = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            temp = temp.next;
            fast = fast.next.next;
        }

        ListNode next = temp.next;
        ListNode prev = null;
        while(temp!=null){
            temp.next = prev;
            prev = temp;
            temp = next;
            if(next!=null){
                next = next.next;
            }
        }

        while(prev !=null){
            if(head.val!=prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }

        return true;



    }
}