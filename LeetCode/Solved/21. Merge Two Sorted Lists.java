class Solution {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(3);
        ListNode list2 = new ListNode(1);
        list2.add(3);
        list2.add(4);
        ListNode result = ListNode.mergeTwoLists(list1, list2);
        while (result!=null) {
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void add(int data) {
        ListNode curNode = this;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = new ListNode(data);
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;

        while (l1!= null && l2!= null) {
            if (l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }
        while (l1 != null) {
            result.next = l1;
            l1 = l1.next;
            result = result.next;
        }
        while (l2 != null) {
            result.next = l2;
            l2 = l2.next;
            result = result.next;
        }
        return head.next;
    }
}