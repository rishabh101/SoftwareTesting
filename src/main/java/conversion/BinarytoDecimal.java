package conversion;

// This class converts a Binary number to a Decimal number

public class BinarytoDecimal {

    public int binarytodecimal(int binNum) {

        int binCopy, d, s = 0, power = 0;

        binCopy = binNum;
        while (binCopy != 0) {
            d = binCopy % 10;
            s += d * (int) Math.pow(2, power++);
            binCopy /= 10;
        }

        System.out.println("Result : "+s);
        return s;
    }
}