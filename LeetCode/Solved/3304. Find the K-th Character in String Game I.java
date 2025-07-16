class Solution {
    public static char getKth(int k) {
        // return (char)('a'+Integer.bitCount(k-1));
        int length = 1;
        while (length<k) {
            length*=2;
        }
        return helper(length, k, 0);
    }

    static char helper(int length, int k, int increments) {
        if (length ==1) {
            return (char)('a'+increments);
        }
        int mid = length/2;
        if (mid>=k) {
            return helper(mid, k, increments);
        } else {
            return helper(mid, k-mid, increments+1);
        }
    }
    public static void main(String[] args) {
        System.out.println(5 + " : " + getKth(5));
        System.out.println(10 + " : " + getKth(10));
    }
}