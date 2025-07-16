import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> findGreater(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            al.add(-1);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int  a : arr) {
            hm.put(a, hm.getOrDefault(a, 0)+1);
        }
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stk.empty() && hm.get(arr[stk.peek()])<hm.get(arr[i])) {
                al.set(stk.pop(), arr[i]);
            }
            stk.push(i);
        }

        return al;
    }

    public static void main(String[] args) {
        for (Integer i : findGreater(new int[] {2, 1, 1, 3, 2, 1})) { 
            System.out.print(i+" "); // OP : 1, -1, -1, 2, 1, -1
        }
        System.out.println();
        for (Integer i : findGreater(new int[] {5, 1, 5, 6, 6})) { 
            System.out.print(i+" "); // OP : 1, -1, -1, 2, 1, -1
        }
    }
}