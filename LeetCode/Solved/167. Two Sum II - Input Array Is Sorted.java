class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0,r=numbers.length-1;
        while(l<r) {
            if (target == numbers[l]+numbers[r]) {
                return new int[] {l+1,r+1};
            }
            else if (target < numbers[l]+numbers[r]) {
                r--;
            }
            else if (target > numbers[l]+numbers[r]) {
                l++;
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        for (int i : twoSum(new int[] {-1,0}, -1)) {
            System.out.print(i+" ");
        }
    }
}
