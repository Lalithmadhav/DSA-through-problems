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
    public static boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rLL = reverse(slow);
        while (rLL!=null) {
            if (rLL.val != head.val) {
                return false;
            }
            rLL = rLL.next;
           head =head.next;
        }
        return true;
    }
    static ListNode reverse(ListNode head) {
        ListNode rL = null;
        while (head!=null) {
            ListNode n = head.next;
            head.next = rL;
            rL = head;
            head = n;
        }
        return rL;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(1,a);
        ListNode c = new ListNode(3,b);
        ListNode d = new ListNode(1,c);

        System.out.println(isPalindrome(d));
    }
}