package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {
    public static void main(String[] args) {
        int [][] maatriks = new int[9][9];

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if ((j<=i && j <=(maatriks[j].length - i - 1)) || !(j<=(i - 1) || j <=maatriks[j].length - i - 2)) {
                    maatriks[j][i] = 1;
                }
            }
        }
        printM(maatriks);
    }
static void printM(int[][] m){

        for(int j =0; j<m.length; j++){
            for(int i=0; i<m[j].length;i++){
                System.out.print(m[j][i]);
            }
            System.out.println();
        }

}
}


