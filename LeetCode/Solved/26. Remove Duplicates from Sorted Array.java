class Solution {
    public static int removeDuplicates(int[] nums) {
        int a =0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[a]!=nums[i]) {
                a++;
                nums[a] = nums[i];
            }
        }
        return a+1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
    }
}
