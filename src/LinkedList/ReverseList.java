package LinkedList;

// Problem 206: Leetcode
// we have to return the reversed linked list
// approach
// create 3 references, prev, present and later
// initally prev will be null, present will point to the head of the list and later will point to the next node of present
// keep updating the pointers
// time complexity: O(n)
// space complexity: O(1)

class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode later = pres.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = later;
            if(later!=null){
                later = later.next;
            }
        }
        return prev;
        
    }
}