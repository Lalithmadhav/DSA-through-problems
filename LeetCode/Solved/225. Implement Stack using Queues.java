// import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    // Deque<Integer> q1;
    // Deque<Integer> q2;
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x); // add -> addFirst when using Deque
        // int size = q1.size();
        // while (size>1) {
        //     q1.add(q1.remove());
        //     size--;
        // }
    }
    
    public int pop() {
        while (q1.size()>1) {
            q2.add(q1.remove()); // remove -> removeLast when using Deque
        }
        int remove = q1.remove();
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return remove;
        // return q1.remove();
    }
    
    public int top() {
        while (q1.size()>1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        q1.add(top);
        return top;
        // return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
        // return q1.isEmpty();
    }
}

class Solution {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        System.out.println(s.top());
       System.out.println(s.pop());
        System.out.println(s.empty());;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */