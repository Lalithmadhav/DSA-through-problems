import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int N = arr.length;
        ArrayList<Integer> result = new ArrayList<>(N);
        for(int i = 0;i<N;i++) {
            result.add(-1);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<2*N-1;i++){
            int num=arr[i%N];
            while (!stack.empty() && arr[stack.peek()]<num) {
                result.set(stack.pop(), num);
            }
            if (i<N) {
                stack.push(i%N);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (Integer a : nextLargerElement(new int[] {1, 3, 2, 4})) { // 3, 4, 4, -1
            System.out.print(a+" ");
        }
        System.out.println();
        for (Integer a : nextLargerElement(new int[] {0, 2, 3, 1, 1})) { // 2, 3, -1, 2, 2
            System.out.print(a+" ");
        }
    }
}
