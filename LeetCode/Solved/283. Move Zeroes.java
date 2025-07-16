class Solution {
    public static void moveZeroes(int[] nums) {
        if (nums.length<2) {
            return;
        }
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[a] = nums[i];
                a++;
            }
        }
        for (int i = a; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {2,1});
    }
}