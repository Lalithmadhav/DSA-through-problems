import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            if (!hm.containsKey(new String(a))) {
                hm.put(new String(a), new ArrayList<>());
            }
            hm.get(new String(a)).add(strs[i]);
            // hm.computeIfAbsent(new String(a), k->new ArrayList<>()).add(strs[i]);
        }System.out.println(hm);
        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        System.out.print("[");
        for (List<String> i : groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"})) {
            System.out.print("[");
            for (String j : i) {
                System.out.print(j+" ");
            }System.out.print("]");
        }
        System.out.print("]");
    }
}