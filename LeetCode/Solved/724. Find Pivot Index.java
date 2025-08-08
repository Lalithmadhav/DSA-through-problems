class Solution {
    public static int pivotIndex(int[] nums) {
        int[] psum =new int[nums.length+1];
        psum[0] = 0;
        for(int i=0;i< nums.length;i++){
            psum[i+1] = psum[i]+nums[i];
        }
        for(int i=1;i<psum.length;i++){
            if(psum[i-1] == psum[psum.length-1]-psum[i]) return i-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] nums = {1,7,3,6,5,6};
        // int[] nums = {1,2,3};
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}