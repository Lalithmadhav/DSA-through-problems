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
}

class Solution {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        // ListNode d = new ListNode(-4);
        // ListNode c = new ListNode(0);
        // ListNode b = new ListNode(2);
        // ListNode a = new ListNode(3);

        // a.next = b;
        // b.next =c;
        // c.next = d;
        // d.next =b;

        // ListNode a = new ListNode(1);

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);

        a.next = b;

        System.out.println(hasCycle(a));
    }
}