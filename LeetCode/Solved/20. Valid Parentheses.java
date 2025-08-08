import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        if (s.length()%2!=0) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(') st.push(')');
            else if (s.charAt(i)=='[') st.push(']');
            else if (s.charAt(i)=='{') st.push('}');
            else if (st.isEmpty() || st.pop()!=s.charAt(i)) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }
}