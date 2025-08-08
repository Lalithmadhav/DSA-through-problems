import java.util.HashMap;
import java.util.Map;

class Solution {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
        int length = 0;
        int left = 0, right =0;
        Map<Character , Integer> hm = new HashMap<>();
        for (; right < str.length(); right++) {
            hm.put(str.charAt(right), hm.getOrDefault(str.charAt(right), 0)+1);
            while (hm.size()>k) {
                hm.put(str.charAt(left), hm.get(str.charAt(left))-1);
                if (hm.get(str.charAt(left))==0) {
                    hm.remove(str.charAt(left));
                }
                left++;
            }
            length = Math.max(length, right-left+1);
        }
        return length;
	}
    public static void main(String[] args) {
        System.out.println(kDistinctChars(2, "abbbbbbc"));
    }
}
