import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    myList.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                } else if (sum < 0) {
                    l++;
                } else
                    r--;
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        System.out.print("[");
        for (List<Integer> list : threeSum(new int[] { 2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10 })) {
            System.out.print("[");
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}