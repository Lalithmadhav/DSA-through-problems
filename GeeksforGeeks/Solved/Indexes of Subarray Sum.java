import java.util.ArrayList;
import java.util.List;

class Solution {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int sum = 0;
        // code here
        for (int l = 0, r= 0; r < arr.length; r++) {
            sum += arr[r];
            while (sum > target) {
                sum -=arr[l];
                l++;
            }
            if (sum == target) {
                return new ArrayList<>(List.of(l+1,r+1));
            }
        }
        return new ArrayList<>(List.of(-1));
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1, 2, 3, 7, 5}, 12));
        System.out.println(subarraySum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15));
        System.out.println(subarraySum(new int[] {5, 3, 4}, 2));
    }
}
