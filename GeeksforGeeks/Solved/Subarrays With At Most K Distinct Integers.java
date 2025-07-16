import java.util.HashMap;

class Solution {
    public static int countAtMostK(int arr[], int k) {
        // code here
        int count = 0;
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int l = 0, r = 0; r < arr.length; r++) {
            myHashMap.put(arr[r], myHashMap.getOrDefault(arr[r], 0)+1);
            while (myHashMap.size()>k) {
                myHashMap.put(arr[l], myHashMap.get(arr[l])-1);
                if (myHashMap.get(arr[l])==0) {
                    myHashMap.remove(arr[l]);
                }
                l++;
            }
            count += r-l+1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAtMostK(new int[] {1, 2, 2, 3}, 2)); // OP: 9
        System.out.println(countAtMostK(new int[] {1, 1, 1}, 1)); // OP: 6
        System.out.println(countAtMostK(new int[] {1, 2, 1, 1, 3, 3, 4, 2, 1}, 2)); // OP: 24
    }
}
