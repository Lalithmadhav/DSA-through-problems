import java.util.HashSet;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(i)) {
                 return true;
            } else hs.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
    }
}