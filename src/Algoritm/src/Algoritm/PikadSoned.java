package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {
        int stringLength = 0;
        int avg = 0;
        int longer = 0;

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        for (int i = 0; i < naide.length ; i++) {
            stringLength = naide[i].length();
            avg = avg + stringLength;
            }
        avg = avg/naide.length;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > avg){
                longer +=1;
            }

        }
        System.out.println("Vastus: " +longer);


    }
}
