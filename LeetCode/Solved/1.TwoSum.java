import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if (hm.containsKey(complement)) {
                return new int[] {hm.get(complement),i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        for (int i : twoSum(new int[] {3,2,4}, 6)) {
            System.out.print(i+" ");
        }
    }
     
}