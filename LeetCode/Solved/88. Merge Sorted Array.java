package LeetCode.Solved;

class Solution {
    public static void merge(int[] nums1,int m, int[] nums2, int n) {
        int a = m-1,b = n-1,c = m+n-1;
        while (b>=0) {
            if (a>=0 && nums1[a]>nums2[b]) {
                nums1[c] = nums1[a];
                a--;
            } else {
                nums1[c] = nums2[b];
                b--;
            }
            c--;
        }
        for (int i : nums1) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        merge(nums1, m, nums2, n);
        nums1 = new int[1];
        nums2 = new int[]{1};
        m = 0;
        n = 1;
        merge(nums1, m, nums2, n);
    }
}
