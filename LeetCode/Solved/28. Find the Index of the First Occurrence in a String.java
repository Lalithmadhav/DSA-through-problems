class Solution {
    public int strStr(String haystack, String needle) {
        int nlen =needle.length(), hlen = haystack.length();
        int npoitner =0, hpointer =0;
        if (nlen==0) return 0;
        while (hpointer<hlen) {
            if (haystack.charAt(hpointer)==needle.charAt(npoitner)) {
                hpointer++;
                npoitner++;
            } else {
                hpointer-=npoitner-1;
                npoitner = 0;
            }
            if (npoitner==nlen) {
                return hpointer-npoitner;
            }
        }
        return -1;
    }
    public void main(String args[]) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("mississippi", "issip"));
    }
}