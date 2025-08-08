class Solution {
    public int longestOnes(int[] nums, int k) {
        int length=0, start = 0,end=0, count=0;
        for(;end<nums.length;end++) {
            count+=nums[end];
            if (end-start+1-count>k) {
                count-=nums[start++];
            }
            length = Math.max(length, end-start+1);
        }
        return length;
    }
    public void main(String[] args) {
        System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(longestOnes(new int[] {0,0,0,1}, 4));
    }
}