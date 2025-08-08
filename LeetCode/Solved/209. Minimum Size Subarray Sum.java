class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length= nums.length+1, start =0, end=0, count = 0;
        for(;end<nums.length;end++) {
            count+=nums[end];
            while (start<nums.length&&count>target) {
                count-=nums[start];
                start++;
            }
            if (count==target) {
                length = Math.min(length, end-start+1);
            }
        }
        return length>nums.length?0:length;
    }
    public void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }
}