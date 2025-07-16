class Solution {
    static boolean debug = false;
    public static int countNumbers(int n) {
        int count = 0;
        int sqn = (int) Math.sqrt(n);
        for (int i = 2; i*i*i*i*i*i*i*i<=n; i++) {
            if (isPrime(i)) count++;
        }
        for (int i = 2; i*i<=sqn; i++) {
            for (int j = i+1; i*j<=sqn; j++) {
                if (isPrime(i)&&isPrime(j) ){
                    if (i!=j &&i*i*j*j<=n) {
                        if (debug) System.out.print(i+" : "+j+"\n");
                        count++;
                    }
                    else break;
                }
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n<2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) return false;
        }
        if (debug) System.out.println(n+" is Prime.");;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers(1000));
        // System.out.println(countNumbers(200));
    }
}
