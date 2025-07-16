class Solution {
    public static boolean divby13(String s) {
        // code here
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = (n * 10 + s.charAt(i) - '0') % 13;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(divby13("2911285"));
        System.out.println(divby13("27"));
    }
}