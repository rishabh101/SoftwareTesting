package Misc;

public class NthUglyNumber {

    public long calculate(int n){


        long[] ugly = new long[n];
        int two = 0, three = 0, five = 0;
        long nm2 = 2, nm3 = 3, nm5 = 5;
        long next = 1;

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {
            next = Math.min(nm2, Math.min(nm3, nm5));

            ugly[i] = next;
            if (next == nm2) {
                two = two + 1;
                nm2 = ugly[two] * 2;
            }
            if (next == nm3) {
                three = three + 1;
                nm3 = ugly[three] * 3;
            }
            if (next == nm5) {
                five = five + 1;
                nm5 = ugly[five] * 5;
            }
        }
        System.out.println("Result: "+next);
        return next;
    }
}