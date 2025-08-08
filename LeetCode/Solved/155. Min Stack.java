import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    Deque<int[]> s;
    int minVal = Integer.MAX_VALUE;
    public MinStack() {
       s = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (s.isEmpty()) {
            s.push(new int[] {val, val});
        } else {
            int currentMinSoFar = Math.min(val, s.peek()[1]);
            s.push(new int[] {val, currentMinSoFar});
        }
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek()[0];
    }
    
    public int getMin() {
        return s.peek()[1];
    }
}

class Solution {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());;
        System.out.println(s.getMin());;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */