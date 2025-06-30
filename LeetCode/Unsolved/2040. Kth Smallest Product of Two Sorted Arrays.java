package LeetCode.Unsolved;

class Solution {
    // Time Complexity : O(n*m + n*mlog(n*m))
    // Space Complexity : O(n*m)
    // public static void main(String[] args) {
    // int k = 2;
    // int num1[] = {-2, -1, 0, 1};
    // int num2[] = {3, -1, 2};
    // List<Integer> product = product(num1, num2);
    // Collections.sort(product);
    // System.out.println(product.get(k-1));
    // }

    // static List<Integer> product(int[] num1, int[] num2) {
    // List<Integer> result = new ArrayList<>();
    // for (Integer i : num1) {
    // for (Integer j : num2) {
    // result.add(i*j);
    // }
    // }
    // return result;
    // }

    public static void main(String[] args) {
        // List<Integer> num1 = new ArrayList<>();
        long[] num1 = { -2,-1,0,1,2 };
        long[] num2 = { -3,-1,2,4,5 };
        long k = 4;
        System.out.printf("%d th value : %d", k, KthSmallestProductOfTwoSortedArrays(num1, num2, k));
    }

    private static long KthSmallestProductOfTwoSortedArrays(long[] num1, long[] num2, long k) {
        long low = -10000000000L;
        long high = 10000000000L;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (countPairs(num1, num2, mid) < k) {
                low = mid + 1;
            } else
                high = mid;
        }
        return low;
    }

    private static long countPairs(long[] num1, long[] num2, long mid) {
        long count = 0;
        for (long i : num1) {
            if (i == 0) {
                if (mid >= 0)
                    count += num2.length;
            }
            if (i > 0) {
                count += countLessOrEqual(num2, mid / i);
            }
            if (i < 0) {
                count += num2.length - countGreatOrEqual(num2, (long) Math.ceil((double) mid / i));
            }

        }
        return count;
    }

    private static int countLessOrEqual(long[] num2, long x) {
        int low = 0;
        int high = num2.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (num2[mid] <= x) {
                low = mid + 1;
            } else
                high = mid;
        }
        return low + 1;
    }

    private static int countGreatOrEqual(long[] num2, long x) {
        int low = 0;
        int high = num2.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (num2[mid] >= x) {
                high = mid;
            } else
                low = mid + 1;
        }
        return high + 1;
    }
}