// import java.util.ArrayList;

class Solution {
    static int missingNum(int arr[]) {
        // ArrayList<Integer> a = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     a.add(arr[i]);
        // }
        // a.sort(null);
        // for (int i = 0; i < a.size(); i++) {
        //     if(a.get(i) != i+1) return i+1;
        // }
        // return arr.length+1;

        // int eSum, aSum = 0, n = arr.length+1;
        // for (int i : arr) {
        //     aSum+=i;
        // }
        // eSum = (n)*(n+1)/2;
        // return eSum-aSum;

        int eXOR=0, aXOR = 0;
        for (int i : arr) {
            aXOR^=i;
        }
        for(int i= 1;i<=arr.length+1;i++) {
            eXOR^=i;
        }
        return eXOR^aXOR;
    }

    public static void main(String[] args) {
        System.out.println(missingNum(new int[] {1, 2, 3, 5}));
        System.out.println(missingNum(new int[] {8, 2, 4, 5, 3, 7, 1}));
        System.out.println(missingNum(new int[] {1}));
    }
}
