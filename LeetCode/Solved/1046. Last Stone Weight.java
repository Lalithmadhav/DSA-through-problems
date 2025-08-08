import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int  i : stones) {
            heap.add(i);
        }
        System.out.println(heap);
        int a, b;
        while (heap.size()>=2) {
            a = heap.poll();
            b = heap.poll();
            heap.add(Math.abs(a-b));
        }
        return heap.peek();
    }
    public void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }
}