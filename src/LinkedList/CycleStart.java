package LinkedList;

public class CycleStart {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                length = cycleLength(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        while(length>0){
            s = s.next;
            length--;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }

        return s;
    }
    public int cycleLength(ListNode slow){
        ListNode temp = slow;
        int count = 0;
        do{
            temp = temp.next;
            count++;
        }
        while(temp!=slow);

        return count;
    }
}
