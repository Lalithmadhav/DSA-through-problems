import java.util.Arrays;
// import java.util.HashMap;

class Solution {
    public static boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> hm = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     if (!hm.containsKey(t.charAt(i))) {
        //         return false;
        //     }
        //     hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
        //     if (hm.get(t.charAt(i))==0) {
        //         hm.remove(t.charAt(i));
        //     }
        // }
        // return hm.isEmpty();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
    }
}