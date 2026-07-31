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
class RotatingList {
    public ListNode rotateRight(ListNode head, int k) {
        if( k<=0 || head==null || head.next==null){
            return head;
        }
        int length = 0;
        ListNode temp = head;
        ListNode tail = null;
        while(temp!=null){
            length++;
            tail = temp; // will point to last node when loop ends
            temp = temp.next; 
        }

        ListNode newLast = null;
        ListNode newFirst = head;

        int rotatingVal = k%length;
        if (rotatingVal == 0) {
            return head;
        }
       for(int i = 0; i<length-rotatingVal; i++){
            newLast = newFirst;
            newFirst = newFirst.next;
        }

        tail.next = head;
        head = newFirst;
        newLast.next = null;

        return head;

    }
}