class Solution {

    public static int maximumLength(int[] nums) {
        int oddCount=0, evenCount =0, diffParity=0;
        for (int i : nums) {
            if (i%2==0) {
                evenCount++;
            } else oddCount++;
        }
        int prevParity = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2!=prevParity) {
                prevParity = nums[i]%2;
                diffParity++;
            }
        }
        return Math.max(Math.max(oddCount, evenCount), diffParity);
    }

    public static void main(String[] args) {
        System.out.println(maximumLength(new int[] {1,2,3,4})); //4
        System.out.println(maximumLength(new int[] {1,2,1,1,2,1,2})); //6
        System.out.println(maximumLength(new int[] {1,3})); //2
    }
}