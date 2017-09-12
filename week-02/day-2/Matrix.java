// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int twodim[][];
        twodim = new int[4][4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i == j) {
                    twodim[i][j] = 1;
                } else {
                    twodim[i][j] = 0;
                }

            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.print(twodim[i][j] + " ");
            }
            System.out.println("  ");
        }


    }
}

