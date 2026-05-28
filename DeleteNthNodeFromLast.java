class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode fast = dummy;
        while(count < n && fast != null){
            fast = fast.next;
            count++;
        }

        if(fast == null){
            System.out.println("n is greater than total number of nodes");
            return null;
        }

        ListNode slow = dummy;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}

//  Time Complexity --> O(N) --> list is traversed only once
// confusion may arise that slow is also visiting but we are traversing only till the fast pointer reaaches the null. As soon as the fast pointer reaches null we stop and return our answer. So slow and fast are moving simulataneously not seprately.

// Space Complexity --> O(1) -->  no extra space for storage is used
