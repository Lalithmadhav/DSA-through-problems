import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        for (int i : nums) {
            if (MinHeap.size()<k) {
                MinHeap.add(i);
            } else {
                MinHeap.add(i);
                MinHeap.remove();
            }
        }
        return MinHeap.peek();
    }
    public void main(String[] args) {
        System.out.println(findKthLargest(new int[] {3,2,1,5,6,4}, 2));
    }
}