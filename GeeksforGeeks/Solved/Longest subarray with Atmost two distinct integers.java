import java.util.HashMap;

class Solution {
    public static int totalElements(int[] arr) {
        // code here
        int maxLen = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>(2);
        for (int l = 0, r = 0; r < arr.length; r++) {
            myMap.put(arr[r], myMap.getOrDefault(arr[r], 0) + 1);
            while (myMap.size() > 2) {
                myMap.put(arr[l], myMap.get(arr[l]) - 1);
                if (myMap.get(arr[l]) == 0) {
                    myMap.remove(arr[l]);
                }
                l++;
            }
            System.out.println(myMap);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(totalElements(new int[] { 2, 1, 2 })); // OP: 3
        System.out.println(totalElements(new int[] { 3, 1, 2, 2, 2, 2 })); // OP: 5
        System.out.println(totalElements(new int[] { 5, 5, 5, 5, 5 })); // OP: 5
        System.out.println(totalElements(new int[] { 1,2,3,4,5 })); // OP: 5
    }
}