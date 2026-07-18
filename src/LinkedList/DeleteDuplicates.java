package LinkedList;
// Remove duplicates from the sorted LinkedList and return the sorted list
// problem 83 leetcode
// in my first approach, I tried using slow fast pointers, and updated the list and performed deletions
// the more optimised approach is to use only one node, and instead of changing the data of the nodes, we directly change the links
// in array we update elements, in linkedlist we update the links of the nodes
// either way time complexity = O(n)
// space complexity = O(1)

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }


        return head;
    }
}
