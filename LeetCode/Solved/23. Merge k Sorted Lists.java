import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        ListNode sortedList = new ListNode(0);
        ListNode c = sortedList;
        for (ListNode list : lists) {
            while (list!=null) {
                MinHeap.add(list.val);
                list = list.next;
            }
            
        }
        System.out.println(MinHeap);
        while (!MinHeap.isEmpty()) {
            c.next = new ListNode(MinHeap.poll());
            c = c.next;
        }
        return sortedList.next;
    }
    public void main(String args[]) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(1, b);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(3, d);
        ListNode f = new ListNode(1, e);
        ListNode g = new ListNode(6);
        ListNode h = new ListNode(2, g);

        ListNode[] lists = {c, f, h};
        ListNode sortedList = mergeKLists(lists);
        while (sortedList!=null) {
            System.out.print(sortedList.val+" ");
            sortedList = sortedList.next;
        }
    }
}