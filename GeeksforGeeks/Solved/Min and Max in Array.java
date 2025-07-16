class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Solution {
    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i= 0;i<arr.length;i++) {
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
        }
        return new Pair<>(min, max);
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> result = getMinMax(new int[] {3, 2, 1, 56, 1000, 167});
        System.out.print(result.getKey()+" "+result.getValue());
    }
}