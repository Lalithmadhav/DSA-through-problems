class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode rL = null;
        while (head!=null) {
            ListNode node = head;
            head = head.next;
            node.next = rL;
            rL = node;
        }
        return rL;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);
        ListNode g = e;
        while (g !=null) {
            System.out.print(g.val+" ");
            g = g.next;
        }
        System.out.println();
        ListNode f = reverseList(e);
        while (f !=null) {
            System.out.print(f.val+" ");
            f = f.next;
        }
    }
}