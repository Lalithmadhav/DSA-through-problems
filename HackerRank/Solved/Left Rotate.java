package HackerRank.Solved;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int d = 7;
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        leftRotate(arr, d);
        // for (Integer integer : inplaceLeftRotate(arr, d) {
        //     System.out.println(integer);
        // }
    }

    public static void leftRotate(List<Integer> arr, int d) {
        int n= arr.size();
        d = d%n;
        List<Integer> rotated = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            rotated.add(arr.get((i + d) % n));
            System.out.println(rotated.get(i));
        }
    }

    public static List<Integer> inplaceLeftRotate(List<Integer> arr, int d) {
        int n = arr.size();
        if (n == 0) return arr;
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }

    public static void reverse(List<Integer> arr, int l, int r) {
        while (l<r) {
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            l++;    
            r--;
        }
    }
}
