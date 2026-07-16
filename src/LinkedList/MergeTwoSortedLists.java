package LinkedList;

// Problem  21: Leetcode
// two sorted linkedlists are given and we need to merge them into a sorted list by splicing, not creating more node
// here the wrong approach was to create references for both the lists nodes and their next nodes
// the problem was that while comparing the nodes and moving the references, eventually nullpointerexception arised
// the correct approach is to create a node that we will make the head of our list
// also create a tail reference too, this will always point to the last node, and we will merge the list by using tail.next = x(let's say)
// to go through the lists we can also create two temporary references but here we have used the head pointers only since we wont be having to return those or do any other meaningful operation
// since one list can be longer than the other we have included the condition list1!=null && list2!=null so that null pointer exception doesnt arise
// when all the elements of one list are added and the other list elements are yet to be added, the condition gets false and loop breaks
// then we simple check which list is finished, and direct the next pointer of tail to the other list
// time complexity: O(n)
// space complexity: O(1)
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }

        }
        if(list1!=null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        return dummy.next;
    }
}
