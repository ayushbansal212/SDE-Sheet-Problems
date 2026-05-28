    
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode middleOfLinkedList(ListNode head) {
        if(head == null){
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next; 
        }

        int mid = (size / 2) + 1; // we added one becaus for even we need next mid node and for odd we need exact middle

        int count = 1; 
        ListNode middleNode = head;

        while(count < mid){
            middleNode = middleNode.next;
            count++;
        }

        return middleNode;
    }


} 
}

    // TC --> 2* O(N) as we traversed the list TWICE to get the size and then again to get the middle node
    // SC --> O(1) as we are not using any extra space

    ........................ optimization ................................

class Solution {
    public ListNode middleOfLinkedList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}

// TC --> O(N) as we are traversing the list only once
// SC --> O(1) as we are not using any extra space
