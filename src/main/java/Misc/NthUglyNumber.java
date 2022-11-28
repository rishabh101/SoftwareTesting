package Misc;
//calculating the nth ugly number

public class NthUglyNumber {

    public long calculate(int number){


        long[] uglyarray = new long[number];
        int two = 0, three = 0, five = 0;
        long nm2 = 2, nm3 = 3, nm5 = 5;
        long next = 1;

        uglyarray[0] = 1;

        for (int i = 1; i < number; i++) {
            next = Math.min(nm2, Math.min(nm3, nm5));

            uglyarray[i] = next;
            if (next == nm2) {
                two = two + 1;
                nm2 = uglyarray[two] * 2;
            }
            if (next == nm3) {
                three = three + 1;
                nm3 = uglyarray[three] * 3;
            }
            if (next == nm5) {
                five = five + 1;
                nm5 = uglyarray[five] * 5;
            }
        }
        System.out.println("Result: "+next);
        return next;
    }
}