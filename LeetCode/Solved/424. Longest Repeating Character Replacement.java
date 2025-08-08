class Solution {
    public static int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        int maxCnt = 0, winStart = 0, winEnd = 0;

        for (; winEnd < s.length(); winEnd++) {
            char c = s.charAt(winEnd);
            counter[c - 'A']++;
            maxCnt = Math.max(maxCnt, counter[c - 'A']);
            while (winEnd - winStart + 1 - maxCnt > k) {
                counter[s.charAt(winStart) - 'A']--;
                winStart++;
            }
        }
        return winEnd - winStart;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
    }
}