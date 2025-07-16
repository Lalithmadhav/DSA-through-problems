import java.util.HashMap;
import java.util.Stack;

class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack= new Stack<>();
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && stack.peek()<nums2[i]) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = map.getOrDefault(nums1[i],-1);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int c : nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2})) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (int c : nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4})) {
            System.out.print(c+" ");
        }
    }
}