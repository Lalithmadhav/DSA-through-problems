class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode r = new ListNode();
        ListNode head = r;
        while (l1!=null&&l2!=null) {
            r.next = new ListNode((l1.val+l2.val+carry)%10);
            carry = (l1.val+l2.val+carry)/10;
            l1 = l1.next;
            l2 = l2.next;
            r = r.next;
        }
        while (l1!=null) {
            r.next = new ListNode((l1.val+carry)%10);
            carry = (l1.val+carry)/10;
            l1 = l1.next;
            r = r.next;
        }
        while (l2!=null) {
            r.next = new ListNode((l2.val+carry)%10);
            carry = (l2.val+carry)/10;
            l2 = l2.next;
            r = r.next;
        }
        if (carry>=0) {
            r.next = new ListNode(carry);
        }
        return head.next;
    }
    public void main(String[] args) {
        // ListNode a = new ListNode(3);
        // ListNode b = new ListNode(4, a);
        // ListNode c = new ListNode(2, b);
        // ListNode d = new ListNode(4);
        // ListNode e = new ListNode(6, d);
        // ListNode f = new ListNode(5, e);

        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9,a1);
        ListNode a3 = new ListNode(9,a2);
        ListNode a4 = new ListNode(9,a3);
        ListNode a5 = new ListNode(9,a4);
        ListNode a6 = new ListNode(9,a5);
        ListNode a7 = new ListNode(9,a6);
        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9,b1);
        ListNode b3 = new ListNode(9,b2);
        ListNode b4 = new ListNode(9,b3);

        ListNode g = addTwoNumbers(a7, b4);
        while (g!= null) {
            System.out.println(g.val +" ");
            g = g.next;
        }
    }
}