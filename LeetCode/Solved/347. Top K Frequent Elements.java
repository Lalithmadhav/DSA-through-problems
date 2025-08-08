import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int ks : hm.keySet()) {
                int f = hm.get(ks);
                buckets[f].add(ks);
        }
        int[] result = new int[k];int a = 0;
        for (int i = buckets.length-1; i >=0 && a<k; i--) {
            for (int j : buckets[i]) {
                result[a++] = j;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i : topKFrequent(new int[] {1,1,1,2,2,3}, 2)) {
            System.out.println(i);
        }
    }
}