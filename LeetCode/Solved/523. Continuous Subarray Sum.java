import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (hm.containsKey(prefixSum%k) && i-hm.get(prefixSum%k)>=2) {
                return true;
            }
            hm.putIfAbsent(prefixSum%k, i);
        }
        return false;
    }
    public void main(String[] args) {
        System.out.println(checkSubarraySum(new int[] {1, 0}, 2));
    }
}