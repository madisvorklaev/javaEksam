package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        int paaris = 0;
        int paaritu = 0;
        int esimesesRohkem = 0;
        int teisesRohekm = 0;

        for (int i = 0; i < kraadid1.length; i++) {
            if (kraadid1[i] >= 0) {
                paaris += 1;
            }
            else {
                paaritu += 1;
            }
        }
        esimesesRohkem = paaris - paaritu;
        paaris = 0;
        paaritu = 0;
        for (int i = 0; i < kraadid2.length; i++) {
            if (kraadid2[i] >= 0) {
                paaris += 1;
            }
            else {
                paaritu += 1;
            }
        }
        teisesRohekm = paaris - paaritu;
        System.out.println("Esimeses on postiiivseid rohkem " + esimesesRohkem);
        System.out.println("Teises on positiivseid rohkem " + teisesRohekm);
        }
    }

