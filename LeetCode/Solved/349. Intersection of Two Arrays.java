import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int a = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0)+1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i])) {
                hm.remove(nums2[i]);
                result[a++] = nums2[i];
            }
        }
        return Arrays.copyOf(result, a);
    }
    public static void main(String[] args) {
        for (int i : intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4})) {
            System.out.print(i+" ");
        } System.out.println();
        for (int i : intersection(new int[] {1,2,2,1}, new int[] {2,2})) {
            System.out.print(i+" ");
        }
    }
}