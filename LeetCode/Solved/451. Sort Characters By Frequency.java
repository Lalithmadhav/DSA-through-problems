import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        StringBuilder n = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Character>[] buckets = new ArrayList[s.length()+1];
        for (int i = 0;i<buckets.length;i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Character, Integer> i : hm.entrySet()) {
            char c = i.getKey();
            int freq = i.getValue();
            buckets[freq].add(c);
        }
        for (int i = buckets.length-1; i >= 0; i--) {
            for (int j = 0; j < buckets[i].size(); j++) {
                n.append(String.valueOf(buckets[i].get(j)).repeat(i));
            }
        }

        // PriorityQueue<Character, Integer> MaxHeap = new PriorityQueue<>(/*Collections.reverseOrder()*/(a, b)-> b.getValue()-a.getValue());

        // for (int i : hm.keySet()) {
        //     MaxHeap.add(i);
        // }

        return n.toString();
    }
    public void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}