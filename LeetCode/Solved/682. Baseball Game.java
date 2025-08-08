import java.util.Stack;

class Solution {
    public static int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for (String op: operations) {
            if (op.equals("C")) {
                s.pop();
            } else if (op.equals("D")) {
                s.push(s.peek()*2);
            }else if (op.equals("+")) {
                int top = s.pop();
                int sum = s.peek()+top;
                s.push(top);
                s.push(sum);
            } else {
                s.push(Integer.parseInt(op));
            }
        }
        int r=0;
        for (Integer integer : s) {
            r+=integer;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(calPoints(new String[] {"5","2","C","D","+"}));
    }
}