import java.util.HashMap;

class Solution {
    public static int longestKSubstr(String s, int k) {
        int maxLen = -1;
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            myMap.put(s.charAt(r), myMap.getOrDefault(s.charAt(r), 0)+1);
            while (myMap.size()>k) {
                myMap.put(s.charAt(l), myMap.get(s.charAt(l))-1);
                if (myMap.get(s.charAt(l)) == 0) {
                    myMap.remove(s.charAt(l));
                }
                l++;
            }
            if (myMap.size()==k) {
                maxLen = Math.max(maxLen, r-l+1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestKSubstr("aabacbebebe", 3)); // OP : 7 "cbebebe"
        System.out.println(longestKSubstr("aaaa", 2)); // OP : -1
        System.out.println(longestKSubstr("aabaaab", 2)); // OP : 7 "aabaaab"
    }
}
