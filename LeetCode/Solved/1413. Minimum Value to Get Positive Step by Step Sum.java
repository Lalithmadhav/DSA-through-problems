class Solution {
    public int minStartValue(int[] nums) {
        int[] ps = new int[nums.length+1];
        ps[0]=0;
        int minPrefix = Integer.MAX_VALUE;
        for (int i = 1; i < ps.length; i++) {
            ps[i]=ps[i-1]+nums[i-1];
            if (minPrefix>ps[i]) minPrefix = ps[i];
            System.out.print(ps[i]+" ");
        }
        
        return Math.max(1,1-minPrefix);   
    }
    public void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        // int[] nums = {1,2};
        // int[] nums = {1,-2,-3};
        System.out.println("\n"+minStartValue(nums));
    }
}