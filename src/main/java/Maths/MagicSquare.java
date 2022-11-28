package Maths;

// A magic square of order n is an arrangement of distinct n^2 integers,in a square, such that the n numbers in all
// rows, all columns, and both diagonals sum to the same constant. A magic square contains the integers from 1 to n^2.


public class MagicSquare {

    public int[][] magicsquare(int number) {

        if ((number % 2 == 0) || (number <= 0)) {
            System.out.print("Input number must be odd and >0");
            return null;
        }

        int[][] magic_square = new int[number][number];

        int rowno = number / 2;
        int colno = number - 1;
        magic_square[rowno][colno] = 1;

        for (int i = 2; i <= number * number; i++) {
            if (magic_square[(rowno - 1 + number) % number][(colno + 1) % number] == 0) {
                rowno= (rowno - 1 + number) % number;
                colno = (colno + 1) % number;
            } else {
                colno = (colno - 1 + number) % number;
            }
            magic_square[rowno][colno] = i;
        }

        // print the square
        System.out.println("Result: ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(magic_square[i][j] + " ");
            }
            System.out.println();
        }

        return magic_square;

    }
}