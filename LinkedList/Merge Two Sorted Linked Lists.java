
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode ans = res;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                res.next = temp1;
                temp1 = temp1.next;
            } else {
                res.next = temp2;
                temp2 = temp2.next;
            }
            res = res.next;
        }

        if (temp1 != null) {
            res.next = temp1;
        }

        if (temp2 != null) {
            res.next = temp2;
        }

        return ans.next;
    }
}

// edge case both nodes null
// no loop will run and no else condition so res.next which is null will be
// returned

// edge case 2 -> one node is null
// if condition will run and entire list which is not null will be the answer

// so all edge cases are covered

// time complexity --> O(M+N) --> both list are traversed completely in worst
// case
// Space complexity --> O(1) --> no extra space is used for storing lists
