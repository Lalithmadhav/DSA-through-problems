package GeeksforGeeks.Solved;
import java.util.HashMap;

class Solution {
    public static int substrCount(String s, int k) {
        int count = 0;
        HashMap<Character, Integer> charbox = new HashMap<>();
        for(int r = 0;r<s.length();r++) {
            charbox.put(s.charAt(r), charbox.getOrDefault(s.charAt(r), 0)+1);
            if(r >= k){
                charbox.put(s.charAt(r-k), charbox.getOrDefault(s.charAt(r-k), 0)-1);
                if (charbox.get(s.charAt(r-k)) == 0) {
                    charbox.remove(s.charAt(r-k));
                }
            }
            if(r+1>=k && charbox.size()==k-1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // System.out.println(substrCount("abcc", 2));
        System.out.println(substrCount("aabab", 3));
    }
}