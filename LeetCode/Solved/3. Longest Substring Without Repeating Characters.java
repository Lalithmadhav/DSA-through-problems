import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        int length = Integer.MIN_VALUE;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0, j=0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (hm.containsKey(c)) {
                hm.remove(s.charAt(j++));
            }
            hm.put(c, i);
            length = Math.max(length, i-j+1);
        }
        return length;
    }
    public void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}