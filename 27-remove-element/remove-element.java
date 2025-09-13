class Solution {
    public int removeElement(int[] nums, int val) {
        int b = nums.length-1;
        for(int i = 0;i<=b;i++){
            while(i<b && nums[b]==val) b--;
            if(nums[i] == val){
                nums[i] = nums[b--];
            }
        }
        return b+1;
    }
}